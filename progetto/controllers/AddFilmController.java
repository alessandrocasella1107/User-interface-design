package unical.demacs.informatica.it.progetto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import unical.demacs.informatica.it.progetto.model.FilmHandler;
import unical.demacs.informatica.it.progetto.model.film;
import unical.demacs.informatica.it.progetto.view.Home;


public class AddFilmController {

    @FXML
    private TextField titolo;

    @FXML
    void addFilm(ActionEvent ignoredEvent) {
        try{
            film f= new film(titolo.getText());
            if(FilmHandler.getInstance().addFilm(f)){
                titolo.setText("");
            }
        }catch(IllegalArgumentException ignoredException){
    }
    }

    @FXML
    void chiudi(ActionEvent ignoredEvent) {
        Home.getInstance().createPreferiti();
    }

}
