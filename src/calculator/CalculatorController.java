/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calculator.Calculator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jakub
 */
public class CalculatorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Calculator calculator = new Calculator();
    @FXML
    TextField text1;

    @FXML
    public void clicNumber(ActionEvent a) {
        calculator.printText(text1, (Button) a.getSource());
    }

    @FXML
    public void clicEquel() {
       text1.setText( String.valueOf(calculator.calculate(text1.getText())));
    }
     @FXML
    public void clicBackspace() {
       text1.setText(calculator.backspace(text1.getText()));
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
