package com.jamiexu.staffmanager.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WageSetting extends Application {
    private Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("../fxml/wage_setting.fxml"));
        Scene scene = new Scene(this.root);
        primaryStage.setTitle("工资设定");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
