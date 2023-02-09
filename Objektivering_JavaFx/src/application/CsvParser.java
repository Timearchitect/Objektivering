package application;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


// Using an out-dated method for parsing. I didn't get other methods to work correctly 
public class CsvParser {
	
	 public ArrayList<OrderBean> parsCsv(String filePath) throws IOException {
		 
	        ArrayList<OrderBean> orders = new ArrayList<>();
	        FileReader file = new FileReader(filePath);
	        
	        CSVParser csvParser = new CSVParser(file, CSVFormat.DEFAULT
	                .withHeader("OrderDate", 
		                		"Region", 
		                		"Rep1", 
		                		"Rep2", 
		                		"Item", 
		                		"Units", 
		                		"UnitCost", 
		                		"Total")
	                .withIgnoreHeaderCase()
	                .withTrim()
	                .withFirstRecordAsHeader());
	        
	        for (CSVRecord csvRecord : csvParser) {
	        	
	            String orderDate = csvRecord.get("OrderDate");
	            String region = csvRecord.get("Region");
	            String rep1 = csvRecord.get("Rep1");
	            String rep2 = csvRecord.get("Rep2");
	            String item = csvRecord.get("Item");
	            
	            Long units = 0L;
	            
	            try {
	                units = Long.parseLong(csvRecord.get("Units"));
	            } catch (NumberFormatException e) {
	                System.out.println("Error parsing units value: " + csvRecord.get("Units"));
	            }
	            
	            String unitCost = csvRecord.get("UnitCost");
	            String total = csvRecord.get("Total");
	            
	            OrderBean order = new OrderBean();
	            order.setOrderDate(orderDate);
	            order.setRegion(region);
	            order.setRep1(rep1);
	            order.setRep2(rep2);
	            order.setItem(item);
	            order.setUnits(units);
	            order.setUnitCost(unitCost);
	            order.setTotal(total);
	            orders.add(order);
	        }
	        
	        return orders;
	    }

}

