package application;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XmlParser {
	
	
	public void xmlBuilder() {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		

		try {
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			
//			Document doc = builder.parse("C:\\Users\\lindb\\eclipse-workspace\\Objektivering_JavaFx\\src\\application\\sample.xml");
			Document doc = builder.parse("src/application/sample.xml");
			
			doc.getDocumentElement().normalize();
			
			NodeList rowList = doc.getElementsByTagName("row");			
			
			for (int i = 0; i < rowList.getLength(); i++) {
				
				Node row = rowList.item(i);
				
				
				if (row.getNodeType() == Node.ELEMENT_NODE) {
					
					Element rowElement = (Element) row;
					
					NodeList rowData = row.getChildNodes();
					
					for (int j = 0; j < rowData.getLength(); j++) {
						
						Node data = rowData.item(j);
						
						if (data.getNodeType() == Node.ELEMENT_NODE) {
							
							Element dataElement = (Element) data;
							
							System.out.println(dataElement.getAttribute("OrderDate"));
							
						} 
						
						
					}
					
					
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
