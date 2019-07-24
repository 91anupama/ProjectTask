package com.parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXReadXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SAXParserFactory factory=SAXParserFactory.newInstance();
			SAXParser saxParser=factory.newSAXParser();
			DefaultHandler handler=new DefaultHandler() {
				boolean bfname=false;
				boolean blname=false;
				boolean bemail=false;
				boolean bdepartment=false;
				String id;
				boolean bemp;
				Employee emp;
			public void startElement(String s, String s1, String elementName, Attributes attributes) throws SAXException {
				System.out.println("Start Element:"+elementName);
				if(elementName.equalsIgnoreCase("employee")) {
					emp=new Employee();
					id=emp.getId();
					attributes.getValue(id);
					bemp=true;
				}
				if(elementName.equalsIgnoreCase("firstname")) {
					bfname=true;
				}
				if(elementName.equalsIgnoreCase("lastname")) {
					blname=true;
				}
				if(elementName.equalsIgnoreCase("email")) {
					bemail=true;
				}
				if(elementName.equalsIgnoreCase("department")) {
					bdepartment=true;
				}
			}
			
			public void endElement(String s, String s1, String elementName)throws SAXException{
				System.out.println("End Element : "+elementName);
			}
			public void characters(char ch[], int start, int length)throws SAXException{
				if (bemp) {
					System.out.println("Employee : " + new String(ch, start, length));
					emp.setId(id);
					bemp = false;
				}
	
				if (bfname) {
					System.out.println("First Name : " + new String(ch, start, length));
					bfname = false;
				}
				if (blname) {
					System.out.println("Last Name : " + new String(ch, start, length));
					blname = false;
				}
				if (bemail) {
					System.out.println("Email : " + new String(ch, start, length));
					bemail = false;
				}
				if (bdepartment) {
					System.out.println("Department Name : " + new String(ch, start, length));
					bdepartment = false;
				}
			}
			};
			saxParser.parse("new.xml", handler);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
