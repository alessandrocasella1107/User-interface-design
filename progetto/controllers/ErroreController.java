package unical.demacs.informatica.it.progetto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import unical.demacs.informatica.it.progetto.view.Home;

public class ErroreController {

    @FXML
    private Button Accedi;

    @FXML
    private Button registrati;

    @FXML
    void accedi(ActionEvent event){Home.getInstance().createLogin();}


    @FXML
    void registrati(ActionEvent event) {Home.getInstance().createSignUp();}

}
