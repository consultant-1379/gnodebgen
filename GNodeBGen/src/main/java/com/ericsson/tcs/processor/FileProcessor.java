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

package com.ericsson.tcs.processor;

import java.io.File;
import java.util.List;

import com.ericsson.tcs.config.wrapper.UserConfig;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.controller.MainController;
import com.ericsson.tcs.services.wrapper.FileInfoWrapper;
import com.ericsson.tcs.topology.wrapper.NodeWrapper;

public class FileProcessor implements Runnable {

	private UserConfig config;

	private List<FileInfoWrapper> fileInfoWrapperList;

	public void run() {

		for (FileInfoWrapper fileInfo : fileInfoWrapperList) {

			File inputFileObj = new File(config.getInput_location() + File.separator + fileInfo.getNetworkFunctionDir()
					+ File.separator + fileInfo.getInputFileName());

			String fullFdn = Utils.getFdnWithAllDetails(fileInfo.getInputFileName());
			String interFileNamePattern = fileInfo.getInterRopFileNamePattern();

			if (null != MainController.getNodeToCellMap()) {
				// when topology enabled for streaming & file based
				for (NodeWrapper node : MainController.getNodeToCellMap().get(fullFdn)) {
					String networkFunctionDir = fileInfo.getNetworkFunctionDir();
					String interFileName = interFileNamePattern.replace("{REPLACE_FDN}", node.get__managedElement());

					callingEventFileUpdater(fileInfo.getIntermediatePathLocation(), inputFileObj, interFileName,
							fileInfo.getInterRopStartEpochTime(), networkFunctionDir, node);
				}
			} else {
				// When topology is OFF
				if (config.isStreaming()) {
					// This is for streaming only
					String interFileName = interFileNamePattern.replace("{REPLACE_FDN}",
							Utils.parseNeName(fileInfo.getInputFileName()));
					callingEventFileUpdater(fileInfo.getIntermediatePathLocation(), inputFileObj, interFileName,
							fileInfo.getInterRopStartEpochTime(), null, null);
				} else {
					// This is for file based solution.
					File interFileObj = new File(fileInfo.getIntermediatePathLocation() + File.separator
							+ fileInfo.getInterRopFileNamePattern());
					if (!interFileObj.exists()) {
						callingEventFileUpdater(fileInfo.getIntermediatePathLocation(), inputFileObj,
								fileInfo.getInterRopFileNamePattern(), fileInfo.getInterRopStartEpochTime(), null,
								null);
					}
				}
			}
		}
	}

	private void callingEventFileUpdater(String dir, File input, String newFileName, long newStartEpochTime,
			String nfDir, NodeWrapper node) {
		EventFileUpdater fileUpdate = new EventFileUpdater();
		fileUpdate.setConfig(config);
		fileUpdate.setDir(dir);
		fileUpdate.setFile(input);
		fileUpdate.setNewFileName(newFileName);
		fileUpdate.setNewStartEpochTime(newStartEpochTime);
		fileUpdate.setNfDir(nfDir);
		fileUpdate.setNode(node);
		fileUpdate.init();
	}

	public void setConfig(UserConfig config) {
		this.config = config;
	}

	public void setFileInfoWrapperList(List<FileInfoWrapper> fileInfoWrapperList) {
		this.fileInfoWrapperList = fileInfoWrapperList;
	}

}

