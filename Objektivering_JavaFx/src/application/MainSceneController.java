package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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

public class MainSceneController implements Initializable {

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

//	public final ObservableList<OrderBean> data = FXCollections.observableArrayList(
//		    new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00"),
//		    new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00")
//		);
	
	/*@FXML
	private void initialize() {
		 final ObservableList<OrderBean> data = FXCollections.observableArrayList(
			    new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00"),
			    new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00")
			);
		table.getColumns().clear();
		TableColumn orderdate = new TableColumn("OrderDate");
		orderdate.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("OrderDate"));

		TableColumn region = new TableColumn("Region"); 
		region.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Region"));

		table.setItems(data);
		table.getColumns().addAll(orderdate,region );		
		
	}*/
	
	public ObservableList<OrderBean> getBeans() {
		final ObservableList<OrderBean> beans = FXCollections.observableArrayList();
		beans.add(    new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00"));
		beans.add(    new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00"));

		return beans;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
		//table.getColumns().clear();
//		TableColumn<OrderBean,String> Orderdate = new TableColumn<>("OrderDate");
//		Orderdate.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("OrderDate"));
//		table.getColumns().add(Orderdate);
//		
//		TableColumn<OrderBean,String> Region = new TableColumn<>("Region"); 
//		Region.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Region"));
//		table.getColumns().add(Region);
//
//		
//		TableColumn<OrderBean,String> Rep1 = new TableColumn<>("Rep1");
//		Rep1.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Rep1"));
//		table.getColumns().add(Rep1);
//
//		TableColumn<OrderBean,String> Rep2= new TableColumn<>("Rep2"); 
//		Rep2.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Rep2"));
//		table.getColumns().add(Rep2);
//		
//		TableColumn<OrderBean,String> Item = new TableColumn<>("Item");
//		Item.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Item"));
//		table.getColumns().add(Item);
//		
//		TableColumn<OrderBean,String> Units= new TableColumn<>("Units"); 
//		Units.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Units"));
//		table.getColumns().add(Units);
//		
//		TableColumn<OrderBean,String> Total= new TableColumn<>("Total"); 
//		Total.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Total"));
//		table.getColumns().add(Total);
		
		
		orderDate.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("orderDate"));
		region.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("Region"));
		rep1.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("Rep1"));
		rep2.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("Rep2"));
		item.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("Item"));
		units.setCellValueFactory(   new PropertyValueFactory<OrderBean, Long>("Units"));
		unitCost.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("UnitCost"));
		total.setCellValueFactory(   new PropertyValueFactory<OrderBean, String>("Total"));

	

		System.out.println("INIT finished");

	}
	
	public void parseJson() {		
		System.out.println(table.getHeight());

		int size= jsonList.size();
				//System.out.println(size);
				table.getItems().clear();  //clear all items
				//table.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("OrderDate"));
			

				
				//System.out.println(table.getColumns());
				//TableColumn orderdate = new TableColumn("OrderDate");
				//PropertyValueFactory pf =new PropertyValueFactory<OrderBean,String>("OrderDate");
				//System.out.println( pf.getProperty() );
				
			//	table.getItems().add(new OrderBean("Jacob", "Smith", "jacob.smith@example.com", "Binder", "genshin", (long) 7, "20.39", "140.33.00"));
				//orderdate.setCellValueFactory( pf );
//				TableColumn region = new TableColumn("Region"); 
//				region.setCellValueFactory(   new PropertyValueFactory<OrderBean,String>("Region"));
				
				//table.setItems(data);
		
				//table.getColumns().addAll(orderdate,region );
				//			table.getColumns().addAll(orderdate,region );


	        //table.setItems(data);

				
		for (int i = 0; i < jsonParser.parsJson().size(); i++) {
			table.getItems().add(new OrderBean(
					jsonParser.parsJson().get(i).getOrderDate(),
					jsonParser.parsJson().get(i).getRegion(),
					jsonParser.parsJson().get(i).getRep1(), 
					jsonParser.parsJson().get(i).getRep2(),
					jsonParser.parsJson().get(i).getItem(), 
					jsonParser.parsJson().get(i).getUnits(),
					jsonParser.parsJson().get(i).getUnitCost(), 
					jsonParser.parsJson().get(i).getTotal()));

			//System.out.println(i);
//			jsonParser.parsJson().get(i).getOrderDate();
//			orderDate.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(null  ));
//			
//			orderDate.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getOrderDate()));
//			region.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getRegion()));
//			rep1.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getRep1()));
//			rep2.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getRep2()));
//			item.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getItem()));
//			units.setCellValueFactory(new PropertyValueFactory<OrderBean, Long>(jsonParser.parsJson().get(i).getUnits().toString()));
//			unitCost.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getUnitCost()));
//			total.setCellValueFactory(new PropertyValueFactory<OrderBean, String>(jsonParser.parsJson().get(i).getTotal()));
//			
//			
			
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
