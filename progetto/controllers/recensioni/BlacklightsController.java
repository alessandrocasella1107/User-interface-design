package unical.demacs.informatica.it.progetto.controllers.recensioni;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import unical.demacs.informatica.it.progetto.view.Home;
import java.net.URL;
import java.util.ResourceBundle;

public class BlacklightsController implements Initializable {

    @FXML
    private WebView WebView;

    private WebEngine engine;

    public void initialize(URL arg0, ResourceBundle arg1){
        engine=WebView.getEngine();
        loadPage();
    }

    public void loadPage(){
        engine.load("https://www.youtube.com/embed/PE04ESdgnHI");
    }

    @FXML
    void Azione(ActionEvent event) {
        Home.getInstance().createAzione();
        WebView.getEngine().load(null);
    }

    @FXML
    void Preferiti(ActionEvent event) {
        Home.getInstance().createPreferiti();
        WebView.getEngine().load(null);
    }

    @FXML
    void home_(ActionEvent event) {
        Home.getInstance().createHome();
        WebView.getEngine().load(null);
    }

    @FXML
    void maps(ActionEvent event)  {
        Home.getInstance().createMaps();
        WebView.getEngine().load(null);
    }


}
