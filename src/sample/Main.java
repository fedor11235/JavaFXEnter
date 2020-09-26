package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
        //Parent main = FXMLLoader.load(getClass().getResource("login.fxml"));

        primaryStage.setTitle("Bots");
        primaryStage.setScene(new Scene(login));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}


