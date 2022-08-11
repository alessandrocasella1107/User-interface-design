package unical.demacs.informatica.it.progetto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import unical.demacs.informatica.it.progetto.client.Client;
import unical.demacs.informatica.it.progetto.client.ConnectionException;
import unical.demacs.informatica.it.progetto.view.Home;

import java.io.IOException;

public class RegistrazioneController{

    @FXML
    private PasswordField password;

    @FXML
    private Button registrazione;

    @FXML
    private TextField username;

    @FXML
    private Button accedi;

    @FXML
    void accedi(ActionEvent event) {
        Home.getInstance().createLogin();
    }

    @FXML
    void registrazione(ActionEvent event) throws IOException, ConnectionException {

        String id = Client.getInstance().register(username.getText(), String.valueOf(password.getText()));
        if (id == null) {

        } else {
            if (Client.getInstance().sendEmailVerification()) {
                Home.getInstance().createVerifica();
            }
        }

    }



}
