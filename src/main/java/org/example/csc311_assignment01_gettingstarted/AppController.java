package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label message;

    @FXML
    private TextField numOneField;

    @FXML
    private TextField numTwoField;


    @FXML
    protected void onCalculateButtonClick() {
        try {
            double num1 = Double.parseDouble(numOneField.getText());
            double num2 = Double.parseDouble(numTwoField.getText());
            double sum = num1 + num2;
            message.setText("Sum " + sum);
        } catch (NumberFormatException e) {
            message.setText("Please enter numeric values only");
        }

    }
}