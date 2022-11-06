package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

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
	
	
	JsonParser jsonParser = new JsonParser();
	
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
			
			
			
		}

	}

//	public void test() throws FileNotFoundException {
//		
//		ArrayList<OrderBean> jsonOrders = jsonParser.parsJson();
//		System.out.println(jsonOrders.get(0).getOrderDate());
//		
//		for (int i = 0; i < jsonOrders.size(); i++) {
//			
//			System.out.println(i);
//			
//			textArea.appendText(
//					jsonParser.parsJson().get(i).getOrderDate() + "\n" +
//					jsonParser.parsJson().get(i).getRegion() + "\n" +
//					jsonParser.parsJson().get(i).getRep1() + "\n" +
//					jsonParser.parsJson().get(i).getRep2() + "\n" +
//					jsonParser.parsJson().get(i).getItem() + "\n" +
//					jsonParser.parsJson().get(i).getUnits() + "\n" +
//					jsonParser.parsJson().get(i).getUnitCost() + "\n" +
//					jsonParser.parsJson().get(i).getTotal()
//					);
//		}
//		
//	}

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
