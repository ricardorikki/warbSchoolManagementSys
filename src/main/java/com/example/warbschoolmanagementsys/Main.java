package com.example.warbschoolmanagementsys;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class Main extends Application {
    double x,y;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1020, 640);

        //stage.setResizable(false);
       // stage.setTitle("School Management System");
        //stage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(event ->{
          x = event.getSceneX();
          y = event.getSceneY();
        });

        root.setOnMouseDragged(event ->{
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
        });

        stage.getIcons().add(new Image("C:\\Users\\Rikki\\IdeaProjects\\warbSchoolManagementSys\\src\\main\\resources\\img\\logo2.png"));
        stage.setScene(new Scene (root, 1020, 640));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}