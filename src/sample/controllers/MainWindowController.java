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

/*
Главное окно с выбором "Педагогического направления развития ребёнка"
Необходимо оптимизировать код
 */
public class MainWindowController {

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
    private ImageView i_v1;

    @FXML
    private ImageView i_v2;

    @FXML
    private ImageView i_v3;

    @FXML
    private Label zagolovok_id;

    @FXML
    void initialize()  {

        i_v1.setImage(new Image("./sample/images/физическое развитие/физическоеРазвитие.png"));
        i_v2.setImage(new Image("./sample/images/интелектуальное развитие/интелектуальноеРазвитие.png"));
        i_v3.setImage(new Image("./sample/images/творческое развитие/творческоеРазвитие.png"));

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
//            stage.setResizable(false);
//            stage.setMaximized(true);
        stage.showAndWait();

      });

        button_2.setOnAction(event ->{
            button_2.getScene().getWindow().hide();  //вызов сцены элемента.вызов окна элемента. скрыть


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sample/windows/mainWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }


            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
//            stage.setResizable(false);
//            stage.setMaximized(true);
            stage.showAndWait();

        });

        button_3.setOnAction(event ->{
            button_3.getScene().getWindow().hide();  //вызов сцены элемента.вызов окна элемента. скрыть


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sample/windows/mainWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }


            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
//            stage.setResizable(false);
//            stage.setMaximized(true);
            stage.showAndWait();

        });

    }

}

