package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewJsonParser {
	
	File file = new File("C:\\Users\\lindb\\eclipse-workspace\\Objektivering_JavaFx\\src\\application\\sample.json");
	Scanner sc;
	
	public ArrayList<String> orderDates() {
		
		try {
			sc = new Scanner(file);
			
			ArrayList<String>Orderdate = new ArrayList<String>();
			
			while(sc.hasNext()) {
				
				ArrayList<String> row = new ArrayList<String>();
				row.add(sc.nextLine());
				
				for(var order : row) {
					
					if(order.contains("\"OrderDate\": \"")) {
					String[] arr = order.split(": \"");
					String orderDate = arr[1].replaceAll("\",", "");
					Orderdate.add(orderDate);
					
					}
				}
				
			}
			return Orderdate;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
