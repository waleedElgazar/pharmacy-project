/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author waleed
 */
public class OverviewController implements Initializable {
@FXML
private MediaView media;
private MediaPlayer player;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(url.toString());
        System.out.println( this.getClass().getResource("/view/video.mp4").toExternalForm());
        player=new MediaPlayer(new Media(this.getClass().getResource("/view/video.mp4").toExternalForm()));
        player.setAutoPlay(true);
        media.setMediaPlayer(player);
    }    
    
}
