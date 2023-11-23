module com.mmt {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mmt to javafx.fxml;
    exports com.mmt;
}
