package com.example.vko4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class teht2 extends Application {
    @Override
    public void start(Stage stage) {
        Button Vasen = new Button("Vasen");
        Button Keskella = new Button("Keskella");
        Button Oikealla = new Button("Oikealla");

        HBox buttonit = new HBox(10, Vasen, Keskella, Oikealla);
        VBox vbox = new VBox(buttonit);

        Scene scene = new Scene(vbox, 400, 400);
        stage.setTitle("Tämä on JavaFX - klikkaus ei tee mitään!");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
