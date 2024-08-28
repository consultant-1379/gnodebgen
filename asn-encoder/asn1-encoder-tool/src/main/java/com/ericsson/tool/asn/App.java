package com.ericsson.tool.asn;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.ericsson.tool.asn.encoder.Encoder;
import com.ericsson.tool.asn.encoder.Event;
import com.ericsson.tool.asn.encoder.Type;
import com.ericsson.tool.asn.mapper.utils.XmlLoaderService;

public class App {

    private static final Options options;

    static {
        options = new Options();
        final Option type = new Option("t", "type", true, "feature type lte|nr");
        type.setRequired(true);

        final Option eventIdOption = new Option("id", "eventId", true, "Event Id for which ASN msg need to generate");
        eventIdOption.setRequired(true);

        final Option inputOption = new Option("s", "source", true, "input xml mapping file to use");
        inputOption.setRequired(true);

        options.addOption(type);
        options.addOption(inputOption);
        options.addOption(eventIdOption);
    }

    public static void main(String[] args) {
        final CommandLineParser parser = new DefaultParser();
        try {
            final CommandLine commandLine = parser.parse(options, args);
            final String eventId = commandLine.getOptionValue("eventId");
            final String inputFile = commandLine.getOptionValue("source");
            final String featureType = commandLine.getOptionValue("type");
            final Type type = Type.fromString(featureType);
            final Event event = type.getEventFromId(Integer.parseInt(eventId));
            final Path path = Paths.get(inputFile);
            Object mapper = XmlLoaderService.loadXmlToJavaObjects(path.toFile(), event.getMapperClass());
            encodeAsAsnMsg(event, mapper);
        } catch (ParseException pex) {
            System.err.println(pex.getMessage());
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar <>jar [options] ", options);
            System.exit(1);
        }
    }

    private static void encodeAsAsnMsg(final Event event, final Object mapper) {
        final Encoder encoder = event.getEncoder();
        try {
            encoder.encodeAsn1(mapper);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
