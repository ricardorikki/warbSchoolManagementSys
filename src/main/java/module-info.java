module com.example.warbschoolmanagementsys {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.warbschoolmanagementsys to javafx.fxml;
    exports com.example.warbschoolmanagementsys;
}