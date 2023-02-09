package application;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonParser {
	
	public ArrayList<OrderBean> parsJson(String filePath) {
		
		ArrayList<OrderBean> orderList = new ArrayList<OrderBean>();
		
		JSONArray ja = null;
		
		try {
			
			Reader reader = new FileReader(filePath);
			
			JSONParser parser = new JSONParser();
			
			ja = (JSONArray) parser.parse(reader);
			
			OrderBean currentOrder = null;
			
			JSONObject jo;
			
			for (int i = 0; i < ja.size(); i++) {
				
				jo = (JSONObject) ja.get(i);
				
				currentOrder = new OrderBean(
						(String)jo.get("OrderDate"),
						(String)jo.get("Region"),
						(String)jo.get("Rep1"),
						(String)jo.get("Rep2"),
						(String)jo.get("Item"),
						(Long)jo.get("Units"),
						(String)jo.get("UnitCost"),
						(String)jo.get("Total"));
			
				orderList.add(currentOrder);
			}
			
		} catch (IOException | ParseException e1) {
			e1.printStackTrace();
		}
		
		return orderList;
		
	}
	
	
	
}