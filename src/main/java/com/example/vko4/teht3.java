package com.example.vko4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class teht3 extends Application {
    @Override
    public void start(Stage stage) {

        Rectangle rect = new Rectangle();
        rect.setWidth(100);
        rect.setHeight(300);
        rect.setArcHeight(20);
        rect.setArcWidth(20);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);

        Circle punainen = new Circle(40,  Color.RED);

        Circle keltainen = new Circle(40, Color.YELLOW);

        Circle vihrea = new Circle(40, Color.GREEN);


        GridPane pane = new GridPane();
        pane.setMaxHeight(50);
        pane.setMaxWidth(50);
        pane.getChildren().addAll(punainen,keltainen, vihrea);
        pane.setPadding(new Insets(10,10,10, 10));
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-border-color: black; -fx-border-width: 1");

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Liikennevalo");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
