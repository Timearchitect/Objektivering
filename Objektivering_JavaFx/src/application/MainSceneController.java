package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
	
    @FXML
    public void initialize() {
        orderDate.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
        region.setCellValueFactory(new PropertyValueFactory<>("region"));
        rep1.setCellValueFactory(new PropertyValueFactory<>("rep1"));
        rep2.setCellValueFactory(new PropertyValueFactory<>("rep2"));
        item.setCellValueFactory(new PropertyValueFactory<>("item"));
        units.setCellValueFactory(new PropertyValueFactory<>("units"));
        unitCost.setCellValueFactory(new PropertyValueFactory<>("unitCost"));
        total.setCellValueFactory(new PropertyValueFactory<>("total"));
    }
    
    
    public void parseJson() {
        table.getItems().clear();
        ArrayList<OrderBean> orders = jsonParser.parsJson();
        orders.forEach(order -> table.getItems().add(order));
        table.refresh();
    }
    
    public void parseXml() {
    	 table.getItems().clear();
    	 ArrayList<OrderBean> orders = xmlParser.parseXml();
    	 orders.forEach(order -> table.getItems().add(order));
    	 table.refresh();
    }
    
    public void praseCsv() {
    	 table.getItems().clear();
    	 ArrayList<OrderBean> orders = csvParser.parseCsv();
    	 orders.forEach(order -> table.getItems().add(order));
    	 table.refresh();
    }
   
	public void test() throws CsvValidationException, IOException {
		
	}
}
