package com.hust.kstn.javafx;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.fxml.*;

public class Painter extends Application {
	@Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/hust/kstn/javafx/Painter.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Painter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
