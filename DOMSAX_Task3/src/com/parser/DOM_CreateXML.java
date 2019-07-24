package com.parser;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOM_CreateXML {
	public static final String xmlFilePath="new.xml";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id1;
		Employee emp=new Employee();
				
		
		try {
			DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder=documentFactory.newDocumentBuilder();
			Document document=documentBuilder.newDocument();
			//root element
			Element root=document.createElement("Company");
			document.appendChild(root);
			
			//employee element
			
			Element employee=document.createElement("employee");
			root.appendChild(employee);
			
			//set attribute to staff element
			Attr attr=document.createAttribute("id");
			id1=emp.setId("10");
			attr.setValue(id1);
			employee.setAttributeNode(attr);
			//employee.setAttribute("id", "10");
			
			//Firstname element
			Element firstname=document.createElement("firstname");
			firstname.appendChild(document.createTextNode("URVI"));
			employee.appendChild(firstname);
			
			//lastname element
			Element lastname=document.createElement("lastname");
			lastname.appendChild(document.createTextNode("PANDIT"));
			employee.appendChild(lastname);
			
			//email element
			Element email=document.createElement("email");
			email.appendChild(document.createTextNode("urvi@gmail.com"));
			employee.appendChild(email);
			
			//department document
			Element department=document.createElement("department");
			department.appendChild(document.createTextNode("Human Resources"));
			employee.appendChild(department);
			//create the xml file
			//transform the DOM object to an XML file
			
			TransformerFactory transformerfactory=TransformerFactory.newInstance();
			Transformer transformer=transformerfactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
            
            System.out.println("Creating XML File using DOM");
 
			
			
			
			
		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
