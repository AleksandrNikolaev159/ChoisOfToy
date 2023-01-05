package sample;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static JFXPanel stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("./windows/mainWindow.fxml"));
        primaryStage.setTitle("Выбор игрушки для ребёнка");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.setMaximized(true);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
