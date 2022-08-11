package unical.demacs.informatica.it.progetto.controllers;

import javafx.application.Platform;
import javafx.scene.control.cell.PropertyValueFactory;
import unical.demacs.informatica.it.progetto.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import unical.demacs.informatica.it.progetto.view.Home;
import java.awt.*;

public class PreferitiController extends Component {

    @FXML
    private TableColumn<Prefe, String> Prefe;

    @FXML
    private TableView<Prefe> prefeTable;

    @FXML
    private TableColumn<film,  String> Film;

    @FXML
    private TableView<film> filmTable;

    @FXML
    private VBox finestra;



    public void initialize(){
        filmTable.setItems(FilmHandler.getInstance().getFilm());
        Film.setCellValueFactory(new PropertyValueFactory<>("nome"));

        prefeTable.setItems(PreferitiHandler.getInstance().getFilm());
        Prefe.setCellValueFactory(new PropertyValueFactory<>("nome"));
    }


    @FXML
    void chiudi_app(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void close_menu(ActionEvent event) {finestra.setVisible(false);}

    @FXML
    void logout(ActionEvent event) {
        Home.getInstance().createLogin();
        FilmHandler.getInstance().svuotare();
        PreferitiHandler.getInstance().svuotare();
    }


    @FXML
    void maps(ActionEvent event)  {
        Home.getInstance().createMaps();
    }


    @FXML
    void menu(ActionEvent event) {finestra.setVisible(true);}

    @FXML
    void return_home(ActionEvent event) {Home.getInstance().createHome();}

    @FXML
    void aggiungi(ActionEvent event) {
        Home.getInstance().createAddFilm();
    }


    @FXML
    void svuota(ActionEvent event) {
        FilmHandler.getInstance().svuotare();
    }

    @FXML
    void svuota1(ActionEvent event) {
        PreferitiHandler.getInstance().svuotare();
    }

}