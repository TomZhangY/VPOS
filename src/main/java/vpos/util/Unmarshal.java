package vpos.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.tap.vpos.beans.ObjectFactory;
import org.tap.vpos.beans.VPOS;

public class Unmarshal {
	private JAXBContext jc;
	
	// 将xml转bean对象
	private VPOS unmarshal(String fileContent) throws JAXBException {
		if (jc == null)
			jc = JAXBContext.newInstance(ObjectFactory.class);
		return (VPOS) jc.createUnmarshaller().unmarshal(new StringReader(fileContent));
	}

	//将bean对象转xml
	private String marshal(Object obj) throws JAXBException {
		if (jc == null)
			jc = JAXBContext.newInstance(ObjectFactory.class);
		StringWriter sw = new StringWriter();
		jc.createMarshaller().marshal(obj, sw);
		return sw.toString();
	}
	
	public static void main(String[] args) {
		try {
			VPOS vpos = new Unmarshal().unmarshal("xml");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
