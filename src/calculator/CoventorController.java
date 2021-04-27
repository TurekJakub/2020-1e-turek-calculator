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
import javafx.scene.control.Label;
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
    Label toLabel;
    private Conventor conventor = new Conventor();

    @FXML
    public void clicNumPad(ActionEvent a) {
        Button b = (Button) a.getSource();
        fromTex.setText(fromTex.getText() + b.getText());
    }

    @FXML
    public void clicConvert() {
        String from = String.valueOf(fromUnit.getSelectionModel().getSelectedItem());
        String to = String.valueOf(toUnit.getSelectionModel().getSelectedItem());
        toLabel.setText(conventor.convert("mm", "cm", Double.valueOf(fromTex.getText())));

    }

    @FXML
    public void clicFlat() {
        fromUnit.getSelectionModel().select("--Vyberte jednotky--");
        toUnit.getSelectionModel().select("--Vyberte jednotky--");
        fromUnit.getItems().remove(0, fromUnit.getItems().size());
        String[] units = new String[]{"mm²", "cm²", "dm²", "m²", "km²", "in²",
            "ft²", "yd²", "mi²"};
        fromUnit.getItems().addAll(units);
        toUnit.getItems().addAll(units);

    }

    @FXML
    public void clicLenght() {
        fromUnit.getItems().remove(0, fromUnit.getItems().size());
        fromUnit.getSelectionModel().select("--Vyberte jednotky--");
        toUnit.getSelectionModel().select("--Vyberte jednotky--");
        String[] units = new String[]{"mm", "cm", "dm", "m", "km", "in", "ft",
            "yd", "mi"};
        fromUnit.getItems().addAll(units);
        toUnit.getItems().addAll(units);

    }

    @FXML
    public void clicVolume() {
        fromUnit.getItems().remove(0, fromUnit.getItems().size());
        fromUnit.getSelectionModel().select("--Vyberte jednotky--");
        toUnit.getSelectionModel().select("--Vyberte jednotky--");
        String[] units = new String[]{"ml", "cl", "dl", "l", "hl",
            "čajové lžičky", "polévkové lžíce", "šálky", "pinty", "galony"};
        fromUnit.getItems().addAll(units);
        toUnit.getItems().addAll(units);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fromUnit.getItems().addAll("mm", "cm", "dm", "m", "km", "in", "ft", "yd", "mi");
        toUnit.getItems().addAll("mm", "cm", "dm", "m", "km", "in", "ft", "yd", "mi");
        fromUnit.getSelectionModel().select("--Vyberte jednotky--");
        toUnit.getSelectionModel().select("--Vyberte jednotky--");
    }

}
