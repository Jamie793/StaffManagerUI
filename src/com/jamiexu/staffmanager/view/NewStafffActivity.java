package com.jamiexu.staffmanager.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NewStafffActivity extends Application{

    private Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("../fxml/new_staff.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("添加员工");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
