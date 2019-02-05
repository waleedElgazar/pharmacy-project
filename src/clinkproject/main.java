package clinkproject;
import model.mainmodel;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
public class main extends Application {
   
    static public mainmodel model;
    @Override
    public void start(Stage primaryStage) throws IOException {
     model=new mainmodel(primaryStage);
     model.loginwindow("login");
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
