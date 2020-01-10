package com.jamiexu.staffmanager;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private Label label;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("员工管理系统");

        initMenu();


        primaryStage.setScene(scene);


        primaryStage.show();
    }

    public void initMenu(){
        System.out.println(label);
//        menu_staff_new.setOnAction(event -> {
//            System.out.println(132);
//        });

//        MenuBar menuBar = new MenuBar();
//        borderPane.setTop(menuBar);
//
//        Menu menu_staff = new Menu("员工管理");
//        MenuItem menu_staff_new = new MenuItem("添加员工");
//        MenuItem menu_staff_modify = new MenuItem("修改员工");
//        MenuItem menu_staff_del = new MenuItem("删除员工");
//        menu_staff.getItems().addAll(menu_staff_new,menu_staff_modify,menu_staff_del);
//
//
//        Menu menu_department = new Menu("部门管理");
//        MenuItem menu_department_new = new MenuItem("添加部门");
//        MenuItem menu_department_modify = new MenuItem("修改部门");
//        MenuItem menu_department_del = new MenuItem("删除部门");
//        menu_department.getItems().addAll(menu_department_new,menu_department_modify,menu_department_del);
//
//        menuBar.getMenus().addAll(menu_staff,menu_department);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
