/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jakub
 */
public class MainScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Button calculatorBtn, volumeBtn, conventorBtn;

    @FXML
    public void hitCalculatorBtn() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Stage stage = (Stage) calculatorBtn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
     public void hitConventorBtn() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Conventor.fxml"));
        Stage stage = (Stage) conventorBtn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
      public void hitVolumeBtn() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Volume.fxml"));
        Stage stage = (Stage) volumeBtn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
