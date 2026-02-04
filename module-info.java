module com.example.water {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.water to javafx.fxml;
    exports com.example.water;
}