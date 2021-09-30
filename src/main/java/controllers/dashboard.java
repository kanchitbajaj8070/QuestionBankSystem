package controllers;

import database.databaseHelper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;

import java.net.URL;
import java.util.ResourceBundle;

public class dashboard implements Initializable {

    public static FXMLLoader homeLoader= null;
    public static FXMLLoader questionsloader= null;
    private databaseHelper handler=null;
    public static FXMLLoader categoryLoader=null;
    public static FXMLLoader papersLoader=null;
    public static FXMLLoader usersLoader=null;

        @FXML
        private Tab questionsTab;

        @FXML
        private Tab papersTab;

        @FXML
        private Tab usersTab;

        @FXML
        private Tab categoriesTab;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
