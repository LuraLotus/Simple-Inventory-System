package com.simpleinvtysys;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        MainClass.setRoot("secondary");
    }
}
