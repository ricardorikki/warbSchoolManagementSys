package com.example.warbschoolmanagementsys;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.System.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable {
    @FXML
    private Label exit;

    @FXML
    private StackPane contentArea;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //exit.setOnMouseClicked(e->{exit(0);});

        try {
              Parent fxml = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                 contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
        }
catch (IOException ex) {
    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,ex);
}
    }

public void dashboard(javafx.event.ActionEvent actionEvent) throws IOException{
    Parent fxml = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
    contentArea.getChildren().removeAll();
    contentArea.getChildren().setAll(fxml);
}
    public void addstudent(javafx.event.ActionEvent actionEvent) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("addstudent.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
    public void assessment(javafx.event.ActionEvent actionEvent) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("assessment.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
    public void attendance(javafx.event.ActionEvent actionEvent) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("attendance.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
    public void health(javafx.event.ActionEvent actionEvent) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("health.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
    public void settings(javafx.event.ActionEvent actionEvent) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("settings.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }


}