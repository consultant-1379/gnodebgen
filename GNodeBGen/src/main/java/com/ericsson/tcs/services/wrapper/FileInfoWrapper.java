package com.ericsson.tcs.services.wrapper;

/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

public class FileInfoWrapper {
	
	private String inputFileName;
	private String networkFunctionDir;
	private String intermediatePathLocation;
	private long interRopStartEpochTime;
	private String interRopFileNamePattern;
	
	public FileInfoWrapper(String inputFileName, String networkFunctionDir, String intermediatePathLocation, long interRopStartEpochTime, String interRopFileNamePattern){
		this.inputFileName = inputFileName;
		this.networkFunctionDir = networkFunctionDir;
		this.intermediatePathLocation = intermediatePathLocation;
		this.interRopStartEpochTime = interRopStartEpochTime;
		this.interRopFileNamePattern = interRopFileNamePattern;
	}
	
	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public String getNetworkFunctionDir() {
		return networkFunctionDir;
	}

	public void setNetworkFunctionDir(String networkFunctionDir) {
		this.networkFunctionDir = networkFunctionDir;
	}

	public String getIntermediatePathLocation() {
		return intermediatePathLocation;
	}

	public void setIntermediatePathLocation(String intermediatePathLocation) {
		this.intermediatePathLocation = intermediatePathLocation;
	}

	public long getInterRopStartEpochTime() {
		return interRopStartEpochTime;
	}

	public void setInterRopStartEpochTime(long interRopStartEpochTime) {
		this.interRopStartEpochTime = interRopStartEpochTime;
	}

	public String getInterRopFileNamePattern() {
		return interRopFileNamePattern;
	}

	public void setInterRopFileNamePattern(String interRopFileNamePattern) {
		this.interRopFileNamePattern = interRopFileNamePattern;
	}
	
}

