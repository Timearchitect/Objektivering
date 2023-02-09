package application;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CsvParser {

	
	public ArrayList<OrderBean> parseCsv(){
		
		ArrayList<OrderBean> orderList = new ArrayList<OrderBean>();
	
		try (
				FileReader file = new FileReader("src/application/sample.csv")) {
				List<OrderBean> orders = new CsvToBeanBuilder<OrderBean>(file).withType(OrderBean.class).build().parse();
				orderList.add((OrderBean) orders);

				
		} catch (IOException e) {
		    System.out.println("Error");
		}	
		
		return orderList;

	}

}

