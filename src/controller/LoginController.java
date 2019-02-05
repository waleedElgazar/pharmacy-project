/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import clinkproject.main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
public class LoginController implements Initializable {
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void login(ActionEvent event) throws IOException {
        if(username.getText().equals("waleed")&&password.getText().equals("waleed")){
            main.model.loginwindow("mainwindow");
        }
        else{
            JOptionPane.showMessageDialog(null, "user name or password are incorrect");
            username.setText("");
            password.setText("");
        }
    }
    
}
