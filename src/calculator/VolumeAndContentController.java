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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author jakub
 */
public class VolumeAndContentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    ComboBox oComb;
    @FXML
    ComboBox uComb;
    @FXML
    TextField aTex;
    @FXML
    TextField vTex;
    @FXML
    TextField bTex;
    @FXML
    Label aLab;
    @FXML
    Label bLab;
    @FXML
    Label vLab;
    @FXML
    Label result;
    @FXML
    Label result1;
    @FXML
    Label showResult;
    @FXML
    Label showResult1;
    @FXML
    public void clicNumber(ActionEvent a) {
        Button b = (Button) a.getSource();
        b.setFocusTraversable(false);
        if (aTex.isFocused()) {
            aTex.setText(aTex.getText() + b.getText());
        } else if (vTex.isFocused()) {
            vTex.setText(vTex.getText() + b.getText());
        } else if (bTex.isFocused()) {
            bTex.setText(bTex.getText() + b.getText());
        }

    }

    @FXML
    public void hitCombo() {
        String object = String.valueOf(oComb.getSelectionModel().getSelectedItem());
        switch (object) {
            case "Kruh":
                setValue("r:", null, null, "O:", "S:");
                break;
            case "Obdelník":
                setValue("a:", "b:", null, "O:", "S:");
                break;
            case "Čtverec":
                setValue("a:", null, null, "O:", "S:");
                break;
            case "Trojúhelník":
                setValue("a:", "v:", null, "O:", "S:");
                break;
            case "Válec":
                setValue("r:", "v:", null, "V:", "S:");
                break;
            case "Kvádr":
                setValue("a:", "b:", "c:", "V:", "S:");
                break;
            case "Krychle":
                setValue("a:", null, null, "V:", "S:");
                break;
            case "Jehlan":
                setValue("a:", "v:", "b:", "V:", "S:");
                break;

        }
    }

    @FXML
    public void hitEnter() {
        String object = String.valueOf(oComb.getSelectionModel().getSelectedItem());
        switch (object) {
            case "Kruh":
                //setResult(0, 0)
                break;
            case "Obdelník":
                setValue("a:", "b:", null, "O:", "S:");
                break;
            case "Čtverec":
                setValue("a:", null, null, "O:", "S:");
                break;
            case "Trojúhelník":
                setValue("a:", "v:", null, "O:", "S:");
                break;
            case "Válec":
                setValue("r:", "v:", null, "V:", "S:");
                break;
            case "Kvádr":
                setValue("a:", "b:", "c:", "V:", "S:");
                break;
            case "Krychle":
                setValue("a:", null, null, "V:", "S:");
                break;
            case "Jehlan":
                setValue("b:", "v:", "a:", "V:", "S:");
                break;
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        oComb.getItems().addAll("Čtverec", "Obdelník", "Kruh", "Trojúhelník",
                "Válec", "Kvádr", "Jehlan", "Krychle", "Koule");
        uComb.getItems().addAll("cm", "dm", "m", "in", "ft", "yd");
        uComb.getSelectionModel().select("-Vyberte jednotky-");
        oComb.getSelectionModel().select("-Vyberte obrazec-");

    }

    private void resetState() {
        vTex.setVisible(false);
        bTex.setVisible(false);
        aTex.setVisible(false);
        vTex.setText("");
        bTex.setText("");
        aTex.setText("");
    }

    private void setValue(String a, String b, String v, String res, String res1) {
        resetState();
        aLab.setText(a);
        bLab.setText(b);
        vLab.setText(v);
        result.setText(res);
        result1.setText(res1);
        if (a != null) {
            aTex.setVisible(true);
        }
        if (b != null) {
            bTex.setVisible(true);
        }
        if (v != null) {
            vTex.setVisible(true);
        }

    }
    

    private void setResult(double result, double result1) {
        showResult.setText(String.valueOf(result));
        showResult1.setText(String.valueOf(result1));

    }
}
