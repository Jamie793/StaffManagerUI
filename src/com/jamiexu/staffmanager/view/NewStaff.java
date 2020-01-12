package com.jamiexu.staffmanager.view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class NewStaff extends Application{

    @FXML
    public TableView list_info;

    private Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = FXMLLoader.load(getClass().getResource("../fxml/new_staff.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("添加员工");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println(this.list_info);
    }

    @FXML
    public void initialize() {
        /* anchorPaneLeft has now been populated, so it's now
         *   usable
         */
//        System.out.println(this.menu_staff_new);
        TableColumn tbc_name = new TableColumn("姓名");

        TableColumn tbc_gender = new TableColumn("性别");
        tbc_gender.setMaxWidth(35);

        TableColumn tbc_age = new TableColumn("年龄");
        tbc_age.setMaxWidth(35);

        TableColumn tbc_time = new TableColumn("时间");

        TableColumn tbc_department = new TableColumn("部门");
        tbc_department.setMaxWidth(70);


        TableColumn tbc_position = new TableColumn("职位");
        tbc_position.setMaxWidth(60);

        TableColumn tbc_positionn = new TableColumn("职称");
        tbc_positionn.setMaxWidth(60);

        TableColumn tbc_face = new TableColumn("面貌");
        tbc_face.setMaxWidth(50);

        TableColumn tbc_marry = new TableColumn("婚姻");
        tbc_marry.setMaxWidth(50);
        this.list_info.getColumns().addAll(tbc_name,tbc_gender,tbc_age,tbc_time,tbc_department,tbc_position,tbc_positionn,tbc_face,tbc_marry);
    }

}
