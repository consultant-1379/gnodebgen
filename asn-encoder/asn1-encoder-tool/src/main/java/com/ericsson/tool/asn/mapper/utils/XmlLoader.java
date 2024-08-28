//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.mapper.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;

public class XmlLoader {
    private JAXBContext jaxbContext;
    private Unmarshaller unmarshaller;

    public XmlLoader(Class clazz) {
        try {
            this.jaxbContext = JAXBContext.newInstance(clazz);
            this.unmarshaller = this.jaxbContext.createUnmarshaller();
        } catch (JAXBException var3) {
            throw new RuntimeException(var3);
        }
    }

    public Object loadXml(XMLStreamReader xmlStreamReader) {
        try {
            return this.unmarshaller.unmarshal(xmlStreamReader);
        } catch (JAXBException var3) {
            throw new RuntimeException(var3);
        }
    }
}
