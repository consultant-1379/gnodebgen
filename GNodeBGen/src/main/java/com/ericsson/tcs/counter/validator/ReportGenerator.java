package com.ericsson.tcs.counter.validator;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

import com.ericsson.tcs.constant.Utils;

public class ReportGenerator {

	private Map<String, Map<String, Map<String, Object>>> info;
	private String location;
	private static final String PIPE_SEP = "|";
	private static final String FILE_EXT = ".xlsx";
	private Utils u;

	public ReportGenerator(Map<String, Map<String, Map<String, Object>>> info, String location) {
		// TODO Auto-generated constructor stub
		this.info = info;
		this.location = location;
		u = new Utils();
		generateReport();
	}

	public void generateFileWiseReport() throws Exception {
		for (String f : info.keySet()) {
			FileWriter file = new FileWriter(new File(location + File.separator + f + "_report" + FILE_EXT));
			file.write("Event_Name" + PIPE_SEP + "Counter_Name" + PIPE_SEP + "Meas_Object" + PIPE_SEP + "Counter_Type"
					+ PIPE_SEP + "Instance(s)\n");
			for (String event : info.get(f).keySet()) {
				for (String counter_mo : info.get(f).get(event).keySet()) {
					file.write(event + PIPE_SEP + counter_mo + PIPE_SEP
							+ u.convertObjectToLongValue(info.get(f).get(event).get(counter_mo)) + "\n");
				}
			}
			file.flush();
			file.close();
		}
	}

	public void generateReport() {
		try {
			generateFileWiseReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
