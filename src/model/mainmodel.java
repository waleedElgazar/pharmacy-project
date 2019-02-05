package model;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainmodel {
Stage stage;
public mainmodel(Stage stage){
    this.stage=stage;
}
public void loginwindow(String name) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/"+name+".fxml"));
        //to call controller of this name
        //LoginController logcontrol=new FXMLLoader(getClass().getResource("/view/"+name+".fxml")).getController();
            Scene scene = new Scene(root);
            stage.setTitle("login");
            stage.setScene(scene);
            stage.show();
}/*
public void mainwindow() throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("login ");
            stage.setScene(scene);
            stage.show();
} */
}
