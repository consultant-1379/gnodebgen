package com.ericsson.tcs.counter.validator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;

public class CounterValidatorWorker implements Runnable {

	private int threadId;
	private List<String> fileList;
	private GPBServices gpbService;
	private FileReader fileReader;
	private DecoderService decoder;
	private ScriptEngineManager manager;
	private ScriptEngine engine;
	private String outLoc;
	private Bindings bind;
	private Utils u;

	private Map<String, Map<String, Map<String, Object>>> counterPagStatsMap;
	private List<String> counterPeggedList;

	int debug = 0;

	public void stepCounter(String f, String event, String counter_mo, Object value, boolean check) {
		try {
			if (!counterPagStatsMap.containsKey(f)) {
				counterPagStatsMap.put(f, new HashMap<String, Map<String, Object>>());
			}
			if (!counterPagStatsMap.get(f).containsKey(event)) {
				counterPagStatsMap.get(f).put(event, new HashMap<String, Object>());
			}
			if (!counterPagStatsMap.get(f).get(event).containsKey(counter_mo)) {
				counterPagStatsMap.get(f).get(event).put(counter_mo, value);
			} else {
				if (check) {
					long existingValue = u
							.convertObjectToLongValue(counterPagStatsMap.get(f).get(event).get(counter_mo));
					long newValue = u.convertObjectToLongValue(value);
					if (newValue > existingValue) {
						counterPagStatsMap.get(f).get(event).put(counter_mo, value);
					}
				} else {
					Object newValue = new Long(
							(u.convertObjectToLongValue(counterPagStatsMap.get(f).get(event).get(counter_mo))
									+ u.convertObjectToLongValue(value)));
					counterPagStatsMap.get(f).get(event).put(counter_mo, newValue);
				}
			}
			if (debug == 1) {
				counterPeggedList.add(counter_mo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void forDebug() {
		for (String fdn : counterPagStatsMap.keySet()) {
			System.out.println("\n\n================================");
			System.out.println("FDN Name : " + fdn);
			for (String eventName : counterPagStatsMap.get(fdn).keySet()) {
				System.out.println("\n================================");
				System.out.println("Event Name : " + eventName);
				for (String counterName : counterPagStatsMap.get(fdn).get(eventName).keySet()) {
					System.out.println("Counter Peggig stats : " + counterName + " : "
							+ counterPagStatsMap.get(fdn).get(eventName).get(counterName));
				}
			}
		}
	}

	public Object returnResult(Map<String, Object> eventParamMap, Set<String> paramSet, String condition, CompiledScript cs) {
	// public Object returnResult(Map<String, Object> eventParamMap, Set<String> paramSet, String condition) {
		Object conditionResult = null;
		//String newExpression = condition;
		
		for (String param : paramSet) {
			/* Old Code Start
			newExpression = newExpression.replace(param, String.valueOf(eventParamMap.get(param)));
			Old Code End */

			// New Code Start
			if (null != eventParamMap.get(param)) {
				bind.put(param.replace("|", "__"), u.convertObjectToLongValue(eventParamMap.get(param)));
			} else {
				bind.put(param.replace("|", "__"), String.valueOf(eventParamMap.get(param)));
			}
			// New Code End
		}
		
		try {
			/* Old Code Start
			conditionResult = engine.eval(newExpression);
			Old Code End */
			
			// New Code Start
			conditionResult = cs.eval(bind); 
			// New Code End
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			// System.out.println(paramSet);
			// System.out.println(condition);
			// System.out.println(newExpression);
			e.printStackTrace();
		}
		return conditionResult;
	}

	public boolean isNumeric(String str) {
		return str != null && str.matches("[-+]?\\d*\\.?\\d+");
	}

	public void processFile(String file) {
		try {
			File f = new File(file);
			List<byte[]> eventList = fileReader.getFileEventList(f);
			for (byte[] event : eventList) {
				PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
				int groupId = pmEventMessage.getGroupValue();
				int stepValue = 1;
				if (groupId >= 2 && groupId <= 4) {
					Map<String, Object> eventParamMap = new HashMap<>(); // enriched value map
					String eventName = decoder.getEventName(pmEventMessage).replace("_", "").toLowerCase();
					if (CounterValidatorInitiator.getEtcmEventToCounterMap().containsKey(eventName)) {
						String[] countersList = CounterValidatorInitiator.getEtcmEventToCounterMap().get(eventName)
								.get(0).split(",");
						// 0 ==> counter, 1 ==> params
						if (CounterValidatorInitiator.getEtcmEventToCounterMap().get(eventName).get(1).isEmpty()) {
							// step directly as there is no param and condition
							for (String counter : countersList) {
								if (CounterValidatorInitiator.getEtcmConditionMap().get(eventName).get(counter)
										.containsKey("step_value")) {
									stepValue = Integer.parseInt(CounterValidatorInitiator.getEtcmConditionMap()
											.get(eventName).get(counter).get("step_value"));
								}
								stepCounter(f.getName(), eventName, counter, stepValue, false);
								stepValue = 1;
							}
							continue;
						} else {
							// In case we have parameters available
							Set<String> paramSet = new LinkedHashSet<>();
							for (String s : Arrays.asList(CounterValidatorInitiator.getEtcmEventToCounterMap()
									.get(eventName).get(1).split(","))) {
								paramSet.add(s);
							}
							// Getting values from event for available params in paramSet

							eventParamMap = decoder.getEventParamValueFromSet(pmEventMessage, paramSet);
							
							for (String counter : countersList) {
								stepValue = 1;
								boolean isSameAsExpr = false;
								// processing each counters
								if (CounterValidatorInitiator.getEtcmConditionMap().get(eventName)
										.containsKey(counter)) {
									if (CounterValidatorInitiator.getEtcmConditionMap().get(eventName).get(counter)
											.containsKey("step_value")) {
										if (isNumeric(CounterValidatorInitiator.getEtcmConditionMap().get(eventName)
												.get(counter).get("step_value"))) {
											stepValue = Integer.parseInt(CounterValidatorInitiator.getEtcmConditionMap()
													.get(eventName).get(counter).get("step_value"));
										} else {
											// step value needs to taken from parameter itself
											if (eventParamMap
													.containsKey(CounterValidatorInitiator.getEtcmConditionMap()
															.get(eventName).get(counter).get("step_value"))) {
												Object o = eventParamMap
														.get(CounterValidatorInitiator.getEtcmConditionMap()
																.get(eventName).get(counter).get("step_value"));
												if (o instanceof Long) {
													Long l = (Long) o;
													stepValue = l.intValue();
												} else {
													stepValue = (Integer) o;
												}
											} else if (CounterValidatorInitiator.getEtcmConditionMap().get(eventName)
													.get(counter).get("step_value").equals("SAME_AS_EXPRESSION")) {
												isSameAsExpr = true;
											} else {
												System.out.println("WARNING : Could not step counter : " + counter
														+ ", as not able to find step value parameter : " + stepValue
														+ " in event.");
												continue;
											}
										}
									}
									boolean isMaxCounter = false;
									if (counter.split("\\|")[2].equalsIgnoreCase("MAX")) {
										isMaxCounter = true;
									}
									
									// New Code Start
									CompiledScript cs;
									// New Code End
									
									String normalCondition = "";
									boolean normalResult = false;
									if (CounterValidatorInitiator.getEtcmConditionMap().get(eventName).get(counter)
											.containsKey("normal")) {
										normalCondition = CounterValidatorInitiator.getEtcmConditionMap().get(eventName)
												.get(counter).get("normal");
										
										// New Code Start
										cs = CounterValidatorInitiator.getEngineMap().get(eventName).get(counter).get("normal");
										normalResult = (Boolean) returnResult(eventParamMap, paramSet, normalCondition, cs);
										// New Code End
										
										/* Old Code Start
										normalResult = (Boolean) returnResult(eventParamMap, paramSet, normalCondition);
										Old Code End */
										// Checking both with & operation as we initiate normal result with false
										if (isMaxCounter && !normalResult) {
											continue;
										}
									}
									String stepCondition = "";
									Object stepResultObject = null;
									boolean stepResult = false;
									if (CounterValidatorInitiator.getEtcmConditionMap().get(eventName).get(counter)
											.containsKey("step")) {
										stepCondition = CounterValidatorInitiator.getEtcmConditionMap().get(eventName)
												.get(counter).get("step");
										
										// New Code Start
										cs = CounterValidatorInitiator.getEngineMap().get(eventName).get(counter).get("step");
										stepResultObject = returnResult(eventParamMap, paramSet, stepCondition, cs);
										// New Code End
										
										/* Old Code Start
										stepResultObject = returnResult(eventParamMap, paramSet, stepCondition);
										Old Code End */
										if (!isMaxCounter) {
											// ACC counter can also have boolean as well as decimal values
											if (stepResultObject instanceof Boolean) {
												stepResult = (Boolean) stepResultObject;
											} else {
												stepResult = true;
												if (isSameAsExpr) {
													stepValue = (int) Math
															.round(Double.parseDouble(stepResultObject.toString()));
												}
											}
										} else {
											// For MAX counter does not have different step value, so not replacing
											// stepResultObject with step value
											if (null != stepResultObject) {
												if (stepResultObject instanceof Boolean) {
													for (String p : paramSet) {
														if (stepCondition.contains(p)) {
															stepResultObject = eventParamMap.get(p);
															break;
														}
													}
												} else {
													stepResultObject = (int) Math
															.round(Double.parseDouble(stepResultObject.toString()));
												}
												stepCounter(f.getName(), eventName, counter, stepResultObject,
														isMaxCounter);
											}
											continue;
										}
									}
									if (normalCondition.isEmpty() && stepCondition.isEmpty()) {
										stepCounter(f.getName(), eventName, counter, stepValue, false);
									} else if (!normalCondition.isEmpty() && !stepCondition.isEmpty()) {
										if (normalResult) {
											if (stepResult) {
												stepCounter(f.getName(), eventName, counter, stepValue, false);
											}
										}
									} else if (!normalCondition.isEmpty() && stepCondition.isEmpty()) {
										if (normalResult) {
											stepCounter(f.getName(), eventName, counter, stepValue, false);
										}
									} else if (normalCondition.isEmpty() && !stepCondition.isEmpty()) {
										if (stepResult) {
											stepCounter(f.getName(), eventName, counter, stepValue, false);
										}
									}
								} else {
									stepCounter(f.getName(), eventName, counter, stepValue, false);
								}
							}
						}
					}
				}
			}
			if (debug == 1) {
				forDebug();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		gpbService = new GPBServices();
		fileReader = new FileReader();
		decoder = new DecoderService();
		manager = new ScriptEngineManager();
		engine = manager.getEngineByName("JavaScript");
		counterPagStatsMap = new HashMap<>();
		counterPeggedList = new ArrayList<>();
		
		// New Code Start
		bind = new SimpleBindings();
		// New Code End
		
		u = new Utils();
		for (String f : fileList) {
			processFile(f);
		}
		// CounterValidatorInitiator.infoCollectionMap.putAll(counterPagStatsMap);
		new ReportGenerator(counterPagStatsMap, outLoc);
	}

	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}

	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}

	public void setOutLoc(String outLoc) {
		this.outLoc = outLoc;
	}

}
