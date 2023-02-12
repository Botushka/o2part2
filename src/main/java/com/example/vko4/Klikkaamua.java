package com.example.vko4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Klikkaamua extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Klikkaa mua");

        HBox hboxbutton = new HBox(button);
        BorderPane layout = new BorderPane();
        layout.setCenter(hboxbutton);
        hboxbutton.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 400);
        stage.setTitle("Tämä on JavaFX - klikkaus ei tee mitään!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}