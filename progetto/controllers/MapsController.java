package unical.demacs.informatica.it.progetto.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import unical.demacs.informatica.it.progetto.view.Home;

import java.net.URL;
import java.util.ResourceBundle;

public class MapsController implements Initializable {

    @FXML
    private WebView WebView;

    @FXML
    private VBox finestra;

    private WebEngine engine;


    public void initialize(URL arg0, ResourceBundle arg1){
        engine=WebView.getEngine();
        loadPage();
    }

    public void loadPage(){
        engine.load("https://www.google.com/maps/search/cinema+maps/");
    }


    @FXML
    void menu(ActionEvent event) {
        finestra.setVisible(true);
    }

    @FXML
    void preferiti(ActionEvent event){
        Home.getInstance().createPreferiti();}

    @FXML
    void return_home(ActionEvent event){ Home.getInstance().createHome();}


    @FXML
    void logout(ActionEvent event){
        Home.getInstance().createLogin();
    }

    @FXML
    void chiudi_app(ActionEvent event){
        Platform.exit();
    }

    @FXML
    void close_menu(ActionEvent event){
        finestra.setVisible(false);
    }





}
