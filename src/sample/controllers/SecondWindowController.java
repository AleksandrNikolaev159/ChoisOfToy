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

public class SecondWindowController {

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
    private Label zagolovok_id;

    @FXML
    private Button button_onmain;

    @FXML
    private ImageView i_v1;

    @FXML
    private ImageView i_v2;

    @FXML
    private ImageView i_v3;

    @FXML
    void initialize() {

        zagolovok_id.setText(SecondWindowTrigger.questionsListForSecondWindow.get(0).getImageName());
        button_1.setText(SecondWindowTrigger.questionsListForSecondWindow.get(1).getImageName());
        button_2.setText(SecondWindowTrigger.questionsListForSecondWindow.get(2).getImageName());
        button_3.setText(SecondWindowTrigger.questionsListForSecondWindow.get(3).getImageName());
        i_v1.setImage(new Image(SecondWindowTrigger.questionsListForSecondWindow.get(1).getImageSrc()));
        i_v2.setImage(new Image(SecondWindowTrigger.questionsListForSecondWindow.get(2).getImageSrc()));
        i_v3.setImage(new Image(SecondWindowTrigger.questionsListForSecondWindow.get(3).getImageSrc()));

        button_1.setOnAction(event ->{
            button_1.getScene().getWindow().hide();  //вызов сцены элемента.вызов окна элемента. скрыть
            ThirdWindowTrigger.setQuestionsList(1);


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/windows/thirdWindow.fxml"));

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
            ThirdWindowTrigger.setQuestionsList(2);

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/windows/thirdWindow.fxml"));

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
            ThirdWindowTrigger.setQuestionsList(3);

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/windows/thirdWindow.fxml"));

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

