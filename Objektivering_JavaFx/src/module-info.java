module Objektivering_JavaFx {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.xml;
	requires json.simple;
	requires commons.csv;
	requires com.opencsv;
	
	opens application to javafx.graphics, javafx.fxml;
	exports application;
}
