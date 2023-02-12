module com.example.vko4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vko4 to javafx.fxml;
    exports com.example.vko4;
}