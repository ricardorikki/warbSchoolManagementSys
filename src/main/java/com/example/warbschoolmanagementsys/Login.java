package com.example.warbschoolmanagementsys;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;
import java.io.IOException;


public class Login {

    public void loginActionbtn(ActionEvent event){
        DashboardForm();
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        //Platform.exit();
    }



    public void DashboardForm() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Stage loginStage = new Stage();
            loginStage.getIcons().add(new Image("C:\\Users\\Rikki\\IdeaProjects\\warbSchoolManagementSys\\src\\main\\resources\\img\\logo2.png"));
            loginStage.setScene(new Scene(root, 1020, 640));
            loginStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            e.getCause();
        }


}}
