module Objektivering_JavaFx {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.xml;
	requires json.simple;
	
	opens application to javafx.graphics, javafx.fxml;
    exports application; //<--- Missade denna
}
