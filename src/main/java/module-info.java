module com.simpleinvtysys {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.simpleinvtysys to javafx.fxml;
    exports com.simpleinvtysys;
}
