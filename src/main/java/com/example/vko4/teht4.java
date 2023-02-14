package com.example.vko4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class teht4 extends Application {
    @Override
    public void start(Stage stage) {

        Image lippuS = new Image("E:\\vko4\\src\\main\\java\\com\\example\\vko4\\suomi.png");
        Image lippuukr = new Image("E:\\vko4\\src\\main\\java\\com\\example\\vko4\\ukraine.png");
        Image lippuuk = new Image("E:\\vko4\\src\\main\\java\\com\\example\\vko4\\uk.png");
        Image lippuitaly = new Image("E:\\vko4\\src\\main\\java\\com\\example\\vko4\\italy.png");

        ImageView suomi = new ImageView(lippuS);
        ImageView ukraina = new ImageView(lippuukr);
        ImageView united = new ImageView(lippuuk);
        ImageView italy = new ImageView(lippuitaly);

        suomi.setFitHeight(100);
        suomi.setFitWidth(150);
        ukraina.setFitHeight(100);
        ukraina.setFitWidth(150);
        united.setFitHeight(100);
        united.setFitWidth(150);
        italy.setFitHeight(100);
        italy.setFitWidth(150);

        GridPane pane = new GridPane();
        pane.setHgap(1);
        pane.setVgap(1);
        pane.setPadding(new Insets(1,1,1, 1));

        pane.add(suomi, 0,0);
        pane.add(ukraina, 1,1);
        pane.add(italy, 0,1);
        pane.add(united, 1,0);

        Scene scene = new Scene(pane, 320, 250);
        stage.setTitle("liput!");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
