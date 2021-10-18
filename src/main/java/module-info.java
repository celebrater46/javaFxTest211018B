module com.example.test211018b {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test211018b to javafx.fxml;
    exports com.example.test211018b;
}