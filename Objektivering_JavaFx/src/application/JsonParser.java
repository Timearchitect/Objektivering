package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;






public class JsonParser {

	//File file = new File("C:\\Users\\lindb\\eclipse-workspace\\Objektivering_JavaFx\\src\\application\\sample.json");
	File file = new File("src/application/sample.json");

	
	Scanner sc;
	
	ArrayList<OrderBean> orders = new ArrayList<OrderBean>();
	
	public void test() {
		System.out.println(file.toString());
	}
	
	public String jsonFileRaw() {
		
		String line ="";
		
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				
				line += sc.nextLine() + "\n";
			}			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		return line;
	}
	
	
	public ArrayList<OrderBean> parsJson() {  // active parser
		
		ArrayList<OrderBean> orderList = new ArrayList<OrderBean>();
		
		JSONArray ja = null;
		
	//	try {Reader reader = new FileReader("C:\\Users\\lindb\\eclipse-workspace\\Objektivering_JavaFx\\src\\application\\sample.json");
		try {Reader reader = new FileReader("src/application/sample.json");
			
			
			JSONParser parser = new JSONParser();
			
			ja = (JSONArray) parser.parse(reader);
			 System.out.println(ja);

			OrderBean currentOrder = null;
			
			JSONObject jo;
			
			for (int i = 0; i < ja.size(); i++) {

				jo = (JSONObject) ja.get(i);
				 System.out.println(jo);

				currentOrder = new OrderBean(
						(String)jo.get("OrderDate"),
						(String)jo.get("Region"),
						(String)jo.get("Rep1"),
						(String)jo.get("Rep2"),
						(String)jo.get("Item"),
						(Long)jo.get("Units"),
						(String)jo.get("UnitCost"),
						(String)jo.get("Total"));
				System.out.println(currentOrder.getOrderDate());
				orderList.add(currentOrder);
			}
			
		} catch (IOException | ParseException e1) {
			e1.printStackTrace();
		}
		
		return orderList;
		
	}
	
	
	
}