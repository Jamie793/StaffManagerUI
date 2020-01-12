package com.jamiexu.staffmanager;

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

    @FXML
    private Label label;


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("人力资源管理系统");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onLabelAction(){
        System.out.println(this.menu_staff_new);
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

        this.menu_exit.setOnAction(event -> {
            Stage stage = (Stage) root.getScene().getWindow();
            stage.close();
            Platform.exit();
        });
    }


    public void initMenu() {
//        this.menu_staff_new = this.root.lookup("#menu_bar");
        System.out.println(this.menu_staff_new);
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
