package com.xiangzi.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import com.thoughtworks.xstream.XStream;
import com.xiangzi.po.TextMessage;

public class MessageUtil {
	/**
	 * xml 转换为 map
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	public static Map<String,String> xmltoMap(HttpServletRequest request) throws IOException, DocumentException{
		Map<String,String> map = new HashMap<String,String>();
		SAXReader reader = new SAXReader();
		
		InputStream ins =  request.getInputStream();
		
		Document doc = reader.read(ins);
		Element root = doc.getRootElement();
		
		List<Element> lists = root.elements();
		
		for(Element e:lists){
			map.put(e.getName(), e.getText());
		}
		
		ins.close();
		

		return map;
	}
	
	public static String testMessageToXml(TextMessage textMessage){
		XStream xstream = new XStream();
		String sxml = xstream.toXML(textMessage);
		return sxml;
	}
}
