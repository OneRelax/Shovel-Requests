package github.onerelax.shovelrequests;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartUpController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}