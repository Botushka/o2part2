package com.example.vko4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class teht5 extends Application {
    @Override
    public void start(Stage stage) {

        GridPane gridPane = new GridPane();
        VBox vBox = new VBox();
        HBox hBox = new HBox();

        Image image = new Image("E:\\vko4\\src\\main\\java\\com\\example\\vko4\\ruokalautanen.png");
        ImageView imageView = new ImageView(image);
        imageView.setStyle("-fx-border-color: black; -fx-border-style: solid; -fx-border-width: 50");
        VBox imageBox = new VBox();
        imageBox.setStyle("-fx-border-color: black; -fx-border-style: solid; -fx-border-width: 3");
        imageBox.getChildren().addAll(imageView);
        gridPane.add(imageBox, 0, 0, 1, 7);

        Label label = new Label("0:00");
        label.setPrefWidth(300);
        label.setPrefHeight(100);
        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-border-color: black; -fx-border-width: 2");
        label.setFont(new Font("Tahoma", 30));
        gridPane.add(label, 2, 0, 3, 1);
        GridPane.setValignment(label, VPos.CENTER);

        Button n1 = new Button("1");
        n1.setPrefWidth(100);
        n1.setPrefHeight(105);
        gridPane.add(n1, 2, 2);

        Button n2 = new Button("2");
        n2.setPrefWidth(100);
        n2.setPrefHeight(105);
        gridPane.add(n2, 3, 2);

        Button n3 = new Button("3");
        n3.setPrefWidth(100);
        n3.setPrefHeight(105);
        gridPane.add(n3, 4, 2);

        Button n4 = new Button("4");
        n4.setPrefWidth(100);
        n4.setPrefHeight(105);
        gridPane.add(n4, 2, 3);

        Button n5 = new Button("5");
        n5.setPrefWidth(100);
        n5.setPrefHeight(105);
        gridPane.add(n5, 3, 3);

        Button n6 = new Button("6");
        n6.setPrefWidth(100);
        n6.setPrefHeight(105);
        gridPane.add(n6, 4, 3);

        Button n7 = new Button("7");
        n7.setPrefWidth(100);
        n7.setPrefHeight(105);
        gridPane.add(n7, 2, 4);

        Button n8 = new Button("8");
        n8.setPrefWidth(100);
        n8.setPrefHeight(105);
        gridPane.add(n8, 3, 4);

        Button n9 = new Button("9");
        n9.setPrefWidth(100);
        n9.setPrefHeight(105);
        gridPane.add(n9, 4, 4);

        Button n0 = new Button("0");
        n0.setPrefWidth(100);
        n0.setPrefHeight(105);
        gridPane.add(n0, 2, 5);

        Button start = new Button("Start");
        start.setPrefWidth(100);
        start.setPrefHeight(105);
        gridPane.add(start, 3, 5);

        Button stop = new Button("Stop");
        stop.setPrefWidth(100);
        stop.setPrefHeight(105);
        gridPane.add(stop, 4, 5);

        vBox.getChildren().addAll(gridPane, hBox);
        Scene scene = new Scene(vBox, 1150, 530);
        stage.setTitle("mikro");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}