package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;


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
	@FXML
	private Button btnFile;
	@FXML 
	private Text filePathText;
	
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
    
	JsonParser jsonParser = new JsonParser();
	CsvParser csvParser = new CsvParser();
	XmlParser xmlParser = new XmlParser();
	
	String filePath = "";
	
    // Button for choossing file and also to parse the file (if the file type is correct)
    public void btnFileAction(ActionEvent event) throws IOException {
    	
    	FileChooser fc = new FileChooser();
    	File selectedFile = fc.showOpenDialog(null);
    	
    	if(selectedFile != null) {
    		
    		filePathText.setText(selectedFile.getAbsolutePath());
    		filePath = selectedFile.getAbsolutePath();
    		
    	}
    	else {
    		
    		System.out.println("Not a valid file");
    	}
    	
    	parseManager(filePath);
    }
    
    // Method for Json parser
    public void parseJson() {
        table.getItems().clear();
        ArrayList<OrderBean> orders = jsonParser.parsJson(filePath);
        orders.forEach(order -> table.getItems().add(order));
        table.refresh();
    }
    // Method for Xml parser
    public void parseXml() {
    	 table.getItems().clear();
    	 ArrayList<OrderBean> orders = xmlParser.parseXml(filePath);
    	 orders.forEach(order -> table.getItems().add(order));
    	 table.refresh();
    }
    
    // Method for Csv parser
    public void praseCsv() throws IOException {
    	 table.getItems().clear();
    	 ArrayList<OrderBean> orders = csvParser.parsCsv(filePath);
    	 orders.forEach(order -> table.getItems().add(order));
    	 table.refresh();
    }
   

    // Checks the file type and parse accordingly 
    public void parseManager(String filePath) throws IOException {
    	
    	File fileToValidate = new File(filePath);
    	
    	String fileName = fileToValidate.getName();
    	String extention = "";
    	
    	int i = fileName.lastIndexOf('.');
    	
    	if (i >= 0) {
    		extention = fileName.substring(i+1);
    	}
    	
    	switch(extention) {
    	case "csv": praseCsv();
    		break;
    	case "xml": parseXml();
    		break;
    	case "json": parseJson();
    		break;
    		default: System.out.println("Invalid file");
    		
    	}
    	
    }
    
    // Clear all fields
    public void clear() {
    	
    	filePath = "";
    	table.getItems().clear();
    	filePathText.setText("");
    }
}
