module com.example.rrc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rrc to javafx.fxml;
    exports com.example.rrc;
}