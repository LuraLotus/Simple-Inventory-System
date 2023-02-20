module com.simpleinvtysys {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.simpleinvtysys to javafx.fxml;
    exports com.simpleinvtysys;
}
