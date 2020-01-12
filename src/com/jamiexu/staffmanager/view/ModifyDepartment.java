package com.jamiexu.staffmanager.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ModifyDepartment extends Application {
    private Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("../fxml/modify_department.fxml"));
        Scene scene = new Scene(this.root);
        primaryStage.setTitle("修改查询");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
