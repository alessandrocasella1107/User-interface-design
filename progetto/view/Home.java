package unical.demacs.informatica.it.progetto.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import unical.demacs.informatica.it.progetto.Film_Reviews;
import java.io.IOException;

public class Home {

    private static Home instance= new Home();
    private Stage stage;

    public static Home getInstance(){
        return instance;
    }

    private Home(){
    }

    public void init(Stage stage){
        if(this.stage==null){
            this.stage=stage;
            this.stage.setTitle("Film Reviews");
        }
    }

    public void createLogin() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createSignUp() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Registrazione.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createError() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("errore_.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createVerifica() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("verifica_email.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createHome() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("HomePage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createNewPassword() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("RecuperoPassword.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createAzione() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Azione.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }


    public void createAnimazione() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Animazione.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createCommedia() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Commedia.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createFantascienza() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Fantascienza.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createPreferiti() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Preferiti.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createMaps() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Maps.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createAddFilm() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("AddFilm.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createBigHero() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("BigHero.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createBatman() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Batman.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createAvatar() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Avatar.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createSpace() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("SpaceJam.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }
    public void createLuca() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Luca.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createIncredibili() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Incredibli.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createTopGun() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Top Gun.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createBlackLights() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("BlackLights.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createUncharted() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Uncharted.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createVenom() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Venom.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createMorbius() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Morbius.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createMatrix() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Matrix.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createPerfettiS() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("PerfettiSconosciuti.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createLockdown() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Lockdown.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createModalitaAereo() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("ModalitaAereo.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }

    public void createOverboard() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Film_Reviews.class.getResource("Overboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Film Reviews");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
        }
    }






}
