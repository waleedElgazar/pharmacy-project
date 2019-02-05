package controller;
import clinkproject.main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
public class MainwindowController implements Initializable {

    @FXML
    private VBox p;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     private void overview(ActionEvent event) throws IOException {
       
            main.model.loginwindow("overview");
       
    }
}
