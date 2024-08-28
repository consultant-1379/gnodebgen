//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.mapper.utils;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XmlLoaderService {
    public XmlLoaderService() {
    }

    public static <T> Object loadXmlToJavaObjects(File inputSource, Class clazz) {
        System.out.println("XML mapping File==" + inputSource.getAbsolutePath());
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlInputFactory.setProperty("javax.xml.stream.supportDTD", false);

        XMLStreamReader xmlConfigFis;
        try {
            xmlConfigFis = xmlInputFactory.createXMLStreamReader(new StreamSource(inputSource));
        } catch (XMLStreamException var5) {
            throw new RuntimeException(String.format("Can't load XML file %s", inputSource.getName()), var5);
        }

        XmlLoader xmlConfigLoader = new XmlLoader(clazz);
        return xmlConfigLoader.loadXml(xmlConfigFis);
    }
}
