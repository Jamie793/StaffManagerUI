package com.jamiexu.staffmanager.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ModifyStaff extends Application {
    private Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("../fxml/modify_staff.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("修改资料");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
