package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckMicController{

    @FXML
    private void goToListenMode(ActionEvent event) throws IOException {
        Parent listenScene = FXMLLoader.load(getClass().getResource("CheckMic.fxml"));
        Scene scene = new Scene(listenScene);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
    }


}
