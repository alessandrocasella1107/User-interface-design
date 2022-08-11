package unical.demacs.informatica.it.progetto;

import javafx.application.Application;
import javafx.stage.Stage;
import unical.demacs.informatica.it.progetto.view.Home;

import java.io.IOException;

public class Film_Reviews extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        Home.getInstance().init(stage);
        Home.getInstance().createLogin();
    }

    public static void main(String[] args){
        launch();
    }
}

