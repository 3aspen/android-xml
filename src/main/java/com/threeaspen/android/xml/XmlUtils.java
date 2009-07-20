package com.threeaspen.android.xml;

import java.io.IOException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlSerializer;

public class XmlUtils {

	public static void textTag(XmlSerializer xml, String namespace, String name, Object text) throws IOException {
		xml.startTag(namespace, name);
		if (text != null)
			xml.text(text.toString());
		xml.endTag(namespace, name);
	}

	public static String getChildText(Node n) {
		StringBuffer str = new StringBuffer();
		NodeList nl = n.getChildNodes();
		for (int i=0; i<nl.getLength(); i++) {
			Node c = nl.item(i);
			if (c.getNodeType() == Node.TEXT_NODE) {
				str.append(c.getNodeValue());
			}
		}
		return str.toString();
	}
	
}
