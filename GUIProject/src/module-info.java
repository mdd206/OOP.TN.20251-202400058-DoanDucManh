/**
 * 
 */
/**
 * 
 */
module GUIProject {
	requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive javafx.base;
    
    opens com.hust.kstn.javafx to javafx.fxml;
    
    exports com.hust.kstn.javafx;
}