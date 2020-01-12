package com.jamiexu.staffmanager.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewDepartment extends Application {
    private Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("../fxml/new_department.fxml"));
        Scene scene = new Scene(this.root);
        primaryStage.setTitle("新增部门");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
