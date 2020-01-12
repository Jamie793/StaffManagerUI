package com.jamiexu.staffmanager;

import com.jamiexu.staffmanager.view.ModifyStaff;
import com.jamiexu.staffmanager.view.NewStaff;
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
    public MenuItem menu_staff_modify;

    @FXML
    public MenuItem menu_staff_query;

    @FXML
    public MenuItem menu_staff_delete;

    @FXML
    public MenuItem menu_department_new;

    @FXML
    public MenuItem menu_department_modify;

    @FXML
    public MenuItem menu_department_query;

    @FXML
    public MenuItem menu_department_delete;

    @FXML
    public MenuItem menu_wage_query;

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


        menu_staff_modify.setOnAction(event -> {
            try {
                new ModifyStaff().start(new Stage());
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
