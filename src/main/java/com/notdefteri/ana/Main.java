package com.notdefteri.ana;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/notdefteri/ana/kullaniciArayuz.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Kişisel Not Defteri - Kullanıcı Girişi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
