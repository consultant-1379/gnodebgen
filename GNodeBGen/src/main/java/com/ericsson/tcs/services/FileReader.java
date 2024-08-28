package com.ericsson.tcs.services;

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
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Parser;

/**
 * @author xjaimah
 *
 */
public class FileReader {

	/**
	 * This method will take GPB file as an input and return all the events
	 * associated with it.
	 * 
	 * @param file
	 * @return
	 */
	public List<byte[]> getFileEventList(File file) {
		List<byte[]> fileEventsList = new ArrayList<>();
		try {
			InputStream inputFileStream = readBinaryFile(file);
			CodedInputStream eventStream = CodedInputStream.newInstance(inputFileStream);
			while (!eventStream.isAtEnd()) {
				final int limit = eventStream.pushLimit(eventStream.readRawVarint32());
				final Parser<PmEvent> parser = PmEvent.parser();
				// final Message message = parser.parseFrom(eventStream);
				fileEventsList.add(parser.parseFrom(eventStream).toByteArray());
				eventStream.popLimit(limit);
				eventStream.resetSizeCounter();
			}
			inputFileStream.close();
		} catch (Exception ex) {
			System.out.println("ERROR: Error occur while reading file: " + file.getName());
		}

		return fileEventsList;
	}

	/**
	 * This method will return InputStream object based on file extention
	 * 
	 * @param binaryFile
	 * @return
	 */
	private InputStream readBinaryFile(File binaryFile) {
		try {
			FileInputStream fileStream = new FileInputStream(binaryFile);
			if (binaryFile.getName().endsWith(ConstantParameter.GZ_EXT)) {
				return new BufferedInputStream(new GZIPInputStream(fileStream));
			} else {
				return new BufferedInputStream(new FileInputStream(binaryFile));
			}
		} catch (IOException e) {
			System.out.println("ERROR: Error while creating InputStream : " + e.getMessage());
			return null;
		}
	}

}
