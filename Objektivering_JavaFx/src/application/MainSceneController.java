package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.exceptions.CsvValidationException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;


public class MainSceneController {

	@FXML
	private TableView<OrderBean> table;
	@FXML
	private TableColumn<OrderBean, String> orderDate;
	@FXML
	private TableColumn<OrderBean, String> region;
	@FXML
	private TableColumn<OrderBean, String> rep1;
	@FXML
	private TableColumn<OrderBean, String> rep2;
	@FXML
	private TableColumn<OrderBean, String> item;
	@FXML
	private TableColumn<OrderBean, Long> units;
	@FXML
	private TableColumn<OrderBean, String> unitCost;
	@FXML
	private TableColumn<OrderBean, String> total;
	@FXML
	private TextArea textArea;
	
	
	JsonParser jsonParser = new JsonParser();
	CsvParser csvParser = new CsvParser();
	XmlParser xmlParser = new XmlParser();
	
	ObservableList<OrderBean> jsonList = FXCollections.observableArrayList(jsonParser.parsJson());
	

	public void parseJson() {		
		
		for (int i = 0; i < jsonParser.parsJson().size(); i++) {

			System.out.println(i);
			
			orderDate.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getOrderDate()));
			region.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getRegion()));
			rep1.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getRep1()));
			rep2.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getRep2()));
			item.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getItem()));
			units.setCellValueFactory(new PropertyValueFactory<OrderBean, Long>(jsonParser.parsJson().get(i).getUnits().toString()));
			unitCost.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getUnitCost()));
			total.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getTotal()));
			
			table.getColumns().add(orderDate);
			table.getColumns().add(region);
			table.getColumns().add(rep1);
			table.getColumns().add(rep2);
			table.getColumns().add(item);
			table.getColumns().add(units);
			table.getColumns().add(unitCost);
			table.getColumns().add(total);
			
			table.getItems().add(i, jsonParser.parsJson().get(i));
			
		}

	}

	public void test() throws CsvValidationException, IOException {
		
		//ArrayList<OrderBean> jsonOrders = jsonParser.parsJson();
		//csvParser.parseCsv();
		ArrayList<OrderBean> xmlOrders = xmlParser.xmlBuilder();
		//System.out.println(jsonOrders.get(0).getOrderDate());
		
		for (int i = 0; i < xmlOrders.size(); i++) {
			
			//System.out.println(i);
			
			textArea.appendText(
					xmlParser.xmlBuilder().get(i).getOrderDate());
			
			
//			textArea.appendText(
//					jsonParser.parsJson().get(i).getOrderDate() + "\n" +
//					jsonParser.parsJson().get(i).getRegion() + "\n" +
//					jsonParser.parsJson().get(i).getRep1() + "\n" +
//					jsonParser.parsJson().get(i).getRep2() + "\n" +
//					jsonParser.parsJson().get(i).getItem() + "\n" +
//					jsonParser.parsJson().get(i).getUnits() + "\n" +
//					jsonParser.parsJson().get(i).getUnitCost() + "\n" +
//					jsonParser.parsJson().get(i).getTotal());
//		}
		
	}

//	public void getFile(ActionEvent event) {
//		
//		FileChooser fc = new FileChooser();
//		File selectedFile = fc.showOpenDialog(null);
//		
//		String filePath;
//		
//		if (selectedFile != null) {
//			filePathText.setText(selectedFile.getAbsolutePath().toString());
//			System.out.println("File: " + selectedFile.getName());
//		} else {
//			filePathText.setText("No file selected");
//			System.out.println("No file");
//		}		
//	}
//	
//	public void parseFile(ActionEvent event) {
//		
//		System.out.println("Path: " + filePathText.getText());
//		
//	}

	}
}
