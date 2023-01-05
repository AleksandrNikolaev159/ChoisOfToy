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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sample.triggers.SecondWindowTrigger;
import sample.triggers.ThirdWindowTrigger;

public class ThirdWindowController {

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
    private Label zagolovok_id;

    @FXML
    private ImageView i_v1;

    @FXML
    private ImageView i_v2;

    @FXML
    private ImageView i_v3;

    @FXML
    void initialize() {

        zagolovok_id.setText(ThirdWindowTrigger.questionsList.get(0).getImageName());
        button_1.setText(ThirdWindowTrigger.questionsList.get(1).getImageName());
        button_2.setText(ThirdWindowTrigger.questionsList.get(2).getImageName());
        if (ThirdWindowTrigger.questionsList.get(3).getImageName().equals("")){
            button_3.setMaxSize(0,0);
            button_3.setMinSize(0,0);
        } else {
            button_3.setText(ThirdWindowTrigger.questionsList.get(3).getImageName());
        }
        i_v1.setImage(new Image(ThirdWindowTrigger.questionsList.get(1).getImageSrc()));
        i_v2.setImage(new Image(ThirdWindowTrigger.questionsList.get(2).getImageSrc()));
        i_v3.setImage(new Image(ThirdWindowTrigger.questionsList.get(3).getImageSrc()));
        button_1.setOnAction(event ->{
            button_1.getScene().getWindow().hide();  //вызов сцены элемента.вызов окна элемента. скрыть


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
            stage.setResizable(false);
            stage.setMaximized(true);
            stage.showAndWait();

        });

        button_2.setOnAction(event ->{
            button_2.getScene().getWindow().hide();  //вызов сцены элемента.вызов окна элемента. скрыть

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
            stage.setResizable(false);
            stage.setMaximized(true);
            stage.showAndWait();

        });

        button_3.setOnAction(event ->{
            button_3.getScene().getWindow().hide();  //вызов сцены элемента.вызов окна элемента. скрыть

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
            stage.setResizable(false);
            stage.setMaximized(true);
            stage.showAndWait();

        });


        button_onmain.setOnAction(event -> {
            button_onmain.getScene().getWindow().hide();
            SecondWindowTrigger.clearQuestionsListForSecondWindow();
            ThirdWindowTrigger.removeQuestionsList();
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
            stage.setResizable(false);
            stage.setMaximized(true);
            stage.show();

        });
    }

}
