package unical.demacs.informatica.it.progetto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import unical.demacs.informatica.it.progetto.client.Client;
import unical.demacs.informatica.it.progetto.client.ConnectionException;
import unical.demacs.informatica.it.progetto.view.Home;
import java.io.IOException;

public class LoginController {

    @FXML
    private Button accedi;

    @FXML
    public TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private Button password_nuova;

    @FXML
    private Button registrati_;

    private static LoginController instance;
    public LoginController(){
        instance=this;
    }
    public static LoginController getInstance(){
        return instance;
    }
    public String email(){
        return email.getText();
    }

    @FXML
    void registrati_(ActionEvent event) {Home.getInstance().createSignUp();}


    @FXML
    void accedi_(ActionEvent event) {

        if(password.getText().equals("ciao")){
            Home.getInstance().createHome();
        }

        /*try{
            String id= Client.getInstance().login(email.getText(), String.valueOf(password.getText()));
            if(id!=null){
                Home.getInstance().createHome();
            }
            else{
                Home.getInstance().createError();
            }
        }catch(IOException | ConnectionException exception){}*/
    }


    @FXML
    void reset(ActionEvent event) throws IOException, ConnectionException {
        if(Client.getInstance().resetPassword(email.getText())){
            Home.getInstance().createNewPassword();
        }
    }


}