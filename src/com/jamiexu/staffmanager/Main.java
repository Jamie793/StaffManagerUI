package com.jamiexu.staffmanager;

import com.jamiexu.staffmanager.view.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Main extends Application {

    private Parent root;

    @FXML
    public MenuItem menu_staff_new;

    @FXML
    public MenuItem menu_staff_operation;

    @FXML
    public MenuItem menu_department_new;

    @FXML
    public MenuItem menu_department_operation;

    @FXML
    public MenuItem menu_wage_set;

    @FXML
    public Menu menu_exit;

    @FXML
    public MenuBar menu_bar;


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("人力资源管理系统");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @FXML
    public void initialize() {
        /* anchorPaneLeft has now been populated, so it's now
         *   usable
         */
//        System.out.println(this.menu_staff_new);
        menu_staff_new.setOnAction(event -> {
            try {
                new NewStaff().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        menu_staff_operation.setOnAction(event -> {
            try {
                new ModifyStaff().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        menu_department_new.setOnAction(event -> {
            try {
                new NewDepartment().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        menu_department_operation.setOnAction(event -> {
            try {
                new ModifyDepartment().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        menu_wage_set.setOnAction(event -> {
            try {
                new WageSetting().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        this.menu_exit.setOnAction(event -> {
            Stage stage = (Stage) root.getScene().getWindow();
            stage.close();
            Platform.exit();
        });
    }



    public static void main(String[] args) {
        launch(args);
    }
}
