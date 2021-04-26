/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jakub
 */
public class CoventorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    ComboBox fromUnit, toUnit;
    @FXML
    TextField fromTex;

    @FXML
    public void clicNumPad(ActionEvent a) {
        Button b = (Button) a.getSource();
        fromTex.setText(fromTex.getText() + b.getText());}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fromUnit.getItems().addAll("mm", "cm", "dm", "m", "km", "in", "ft", "yd", "mi");
        toUnit.getItems().addAll("mm", "cm", "dm", "m", "km", "in", "ft", "yd", "mi");
        fromUnit.getSelectionModel().select("--Vyberte jednotky--");
        toUnit.getSelectionModel().select("--Vyberte jednotky--");
    }

}
