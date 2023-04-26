module com.example.ooplab9fix {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ooplab9 to javafx.fxml;
    exports org.example.ooplab9;
}