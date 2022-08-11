package unical.demacs.informatica.it.progetto.controllers;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import unical.demacs.informatica.it.progetto.model.Prefe;
import unical.demacs.informatica.it.progetto.model.PreferitiHandler;
import unical.demacs.informatica.it.progetto.view.Home;

import java.awt.*;


public class AnimazioneController {




    @FXML
    private Text name;

    @FXML
    private Text name2;

    @FXML
    private Text name3;

    @FXML
    private Text name4;

    @FXML
    private Pane pan;



    @FXML
    void Preferiti(ActionEvent event) {
        Home.getInstance().createPreferiti();
    }



    @FXML
    void addPreferiti(ActionEvent event) {
        Prefe p= new Prefe(name.getText());
        if(PreferitiHandler.getInstance().addPrefe(p)){
            name.setText(name.getText());
        }
        pan.setVisible(true);
        PauseTransition pt= new PauseTransition();
        pt.setDuration(Duration.seconds(2));
        pt.setOnFinished(e->{
            pan.setVisible(false);
        });
        pt.play();


    }

    @FXML
    void addPreferiti1(ActionEvent event) {
        Prefe p= new Prefe(name2.getText());
        if(PreferitiHandler.getInstance().addPrefe(p)){
            name2.setText(name2.getText());
        }

        pan.setVisible(true);
        PauseTransition pt= new PauseTransition();
        pt.setDuration(Duration.seconds(2));
        pt.setOnFinished(e->{
            pan.setVisible(false);
        });
        pt.play();

    }

    @FXML
    void addPreferiti2(ActionEvent event) {
        Prefe p= new Prefe(name3.getText());
        if(PreferitiHandler.getInstance().addPrefe(p)){
            name3.setText(name3.getText());
        }

        pan.setVisible(true);
        PauseTransition pt= new PauseTransition();
        pt.setDuration(Duration.seconds(2));
        pt.setOnFinished(e->{
            pan.setVisible(false);
        });
        pt.play();

    }

    @FXML
    void addPreferiti3(ActionEvent event) {
        Prefe p= new Prefe(name4.getText());
        if(PreferitiHandler.getInstance().addPrefe(p)){
            name4.setText(name4.getText());
        }

        pan.setVisible(true);
        PauseTransition pt= new PauseTransition();
        pt.setDuration(Duration.seconds(2));
        pt.setOnFinished(e->{
            pan.setVisible(false);
        });
        pt.play();

    }

    @FXML
    void bighero_recensione(ActionEvent event) {
        Home.getInstance().createBigHero();
    }

    @FXML
    void home_(ActionEvent event){Home.getInstance().createHome();}

    @FXML
    void luca_recensione(ActionEvent event) {
        Home.getInstance().createLuca();

    }

    @FXML
    void maps(ActionEvent event)  {
        Home.getInstance().createMaps();
    }

    @FXML
    void incredibili_recensione(ActionEvent event) {
        Home.getInstance().createIncredibili();

    }

    @FXML
    void spacejam_recensione(ActionEvent event) {
        Home.getInstance().createSpace();

    }

}
