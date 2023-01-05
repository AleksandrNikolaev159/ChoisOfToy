package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sample.triggers.SecondWindowTrigger;

public class FourthWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_onmain;

    @FXML
    private ImageView toy;

    @FXML
    private Label zagolovok_id;

    @FXML
    void initialize() {

        zagolovok_id.setText("Игрушка");
//        toy.setImage(new Image(String.valueOf(ToyService.toyList.get(0).toyFile)));

        button_onmain.setOnAction(event -> {
            button_onmain.getScene().getWindow().hide();
            SecondWindowTrigger.clearQuestionsListForSecondWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/windows/mainWindow.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        });
    }

}
