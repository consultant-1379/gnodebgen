package com.ericsson.tcs.utility.asn1.decoder.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.ericsson.tcs.constant.Utils;

public class Asn1Main {

	public void init(String asnParamConfigLocation, String outputLocation) {
		parseAsnCsv(asnParamConfigLocation, outputLocation);
	}

	private static byte[] payloadToBytes(final String payload) {
		final byte[] val = new byte[payload.length() / 2];
		try {
			for (int i = 0; i < val.length; i++) {
				final int index = i * 2;
				final int j = Integer.parseInt(payload.substring(index, index + 2), 16);
				val[i] = (byte) j;
			}
		} catch (final Exception e) {
			return null;
		}
		return val;
	}

	public void decodeAsnMessage(final String protocolName, final String packageName, final String eventName,
			String asnContent, final String outputFileName, final String outLocation) {
		try {
			final byte[] asnContentHex = payloadToBytes(asnContent);
			String fullFileLocation = null;
			if (outLocation.endsWith("/")) {
				fullFileLocation = outLocation + outputFileName;
			} else {
				fullFileLocation = outLocation + File.separator + outputFileName;
			}
			final String asnNrDecoder = new AsnNrDecoder(protocolName, packageName).decode(eventName, asnContentHex);
			final String actualOutput = asnNrDecoder.replaceAll("[\\n\\t\\s]+", "");

			File writerObj = new File(fullFileLocation);
			if (writerObj.exists()) {
				writerObj.delete();
			}

			FileWriter writer = null;
			try {
				writer = new FileWriter(writerObj);
				writer.write(actualOutput);
			} catch (IOException i) {
				System.out.println("ERROR : IO Exception while writing the file : " + fullFileLocation);
			} finally {
				if (null != writer) {
					try {
						writer.flush();
						writer.close();
					} catch (IOException e) {
						System.out.println("ERROR : IO Exception while closing file : " + fullFileLocation);
					}
				}
			}

		} catch (AsnDecodingException asnExcep) {
			System.out.println("ERROR : ASN Exception while decoding event : " + eventName);
		}
	}

	public void parseAsnCsv(final String csvFile, final String outLocation) {
		System.out.println("INFO : ASN.1 file decoding started.");
		List<String[]> csvObj = Utils.returnCsvObjects(csvFile);
		for (String[] data : csvObj) {
			decodeAsnMessage(data[0], data[1], data[2], data[3], data[4], outLocation);
		}
		System.out.println("INFO : ASN.1 file decoding completed.");
	}

	public static void main(String[] args) {
		Asn1Main m = new Asn1Main();
		m.init("W:/nci_mapping/gnodebgen/GNodeBGen/src/main/resources/config/asnParamConfig.csv",
				"W:/nci_mapping/gnodebgen/GNodeBGen/src/main/resources/config/asn_out/");
	}
}
