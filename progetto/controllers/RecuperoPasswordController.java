package unical.demacs.informatica.it.progetto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import unical.demacs.informatica.it.progetto.view.Home;

public class RecuperoPasswordController {


    @FXML
    private Button accedi;

    @FXML
    void accedi(ActionEvent event) {Home.getInstance().createLogin();}


}

