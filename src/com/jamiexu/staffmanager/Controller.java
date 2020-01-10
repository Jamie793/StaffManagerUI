package com.jamiexu.staffmanager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.omg.Messaging.SyncScopeHelper;


public class Controller {
    @FXML
    private Button menu_staff_new;

    void main(){
        menu_staff_new.setOnAction(event -> {
            System.out.println(123);
        });
    }

}
