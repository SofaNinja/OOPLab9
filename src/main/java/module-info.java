module com.example.ooplab9fix {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.ooplab9fix to javafx.fxml;
    exports com.example.ooplab9fix;
}