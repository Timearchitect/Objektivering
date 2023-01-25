package application;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CsvParser {

	
	public void parseCsv() throws CsvValidationException, IOException{
	
		FileReader file = new FileReader("src/application/sample.csv");		
		
		List<OrderBean> orders = new CsvToBeanBuilder<OrderBean>(file).withType(OrderBean.class).build().parse();
		
		for (OrderBean order: orders) {
			System.out.println(
					order.getOrderDate()
					+ " " +
					order.getRegion()
					+ " " +
					order.getRep1()
					+ " " +
					order.getRep2()
					+ " " +
					order.getItem()
					+ " " +
					order.getUnits()
					+ " " +
					order.getUnitCost()
					+ " " +
					order.getTotal());
		}
		
	}

}

