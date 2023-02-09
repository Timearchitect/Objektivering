package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XmlParser {
	
	public ArrayList<OrderBean> parseXml(String filePath) {
		
		ArrayList<OrderBean> orderList = new ArrayList<OrderBean>();
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File(filePath));
			
			doc.getDocumentElement().normalize();
			
			NodeList rowList = doc.getElementsByTagName("row");			
			
			for (int i = 0; i < rowList.getLength(); i++) {
				
				Node row = rowList.item(i);
				
				if (row.getNodeType() == Node.ELEMENT_NODE) {
				
				Element rowElement = (Element) row;
				NodeList rowData = row.getChildNodes();
				OrderBean currentOrder = new OrderBean();
				
				for (int j = 0; j < rowData.getLength(); j++) {
					
					Node data = rowData.item(j);
					
					if (data.getNodeType() == Node.ELEMENT_NODE) {

						Element dataElement = (Element) data;
						
						switch (dataElement.getTagName()) {
		                case "OrderDate":
		                  currentOrder.setOrderDate(dataElement.getTextContent());
		                  break;
		                case "Region":
		                  currentOrder.setRegion(dataElement.getTextContent());
		                  break;
		                case "Rep1":
		                  currentOrder.setRep1(dataElement.getTextContent());
		                  break;
		                case "Rep2":
		                  currentOrder.setRep2(dataElement.getTextContent());
		                  break;
		                case "Item":
		                  currentOrder.setItem(dataElement.getTextContent());
		                  break;
		                case "Units":
		                  currentOrder.setUnits(Long.parseLong(dataElement.getTextContent()));
		                  break;
		                case "UnitCost":
		                  currentOrder.setUnitCost(dataElement.getTextContent());
		                  break;
		                case "Total":
		                  currentOrder.setTotal(dataElement.getTextContent());
		                  break;
		                default:
		                  break;
		              }
					} 	
				}
	
				orderList.add(currentOrder);
		
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
		
		return orderList;
		
	}
}
