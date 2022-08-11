package unical.demacs.informatica.it.progetto.controllers;




import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import unical.demacs.informatica.it.progetto.view.Home;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class HomeController implements Initializable {


    @FXML
    private VBox finestra;

    @FXML
    public AnchorPane main;

    @FXML
    private Circle profilo;



    @FXML
    public Label welcome;
    public void initialize(URL arg0, ResourceBundle arg1) {
        setUsername(LoginController.getInstance().email());
    }




    @FXML
    void menu(ActionEvent event) {
        finestra.setVisible(true);
    }


    @FXML
    void preferiti(ActionEvent event){Home.getInstance().createPreferiti();}

    @FXML
    void return_home(ActionEvent event){}

    @FXML
    void maps(ActionEvent event)  {
        Home.getInstance().createMaps();
    }




    @FXML
    void roundimage(ActionEvent event) {
        FileChooser open=new FileChooser();
        Stage stage=(Stage) main.getScene().getWindow();

        File file=open.showOpenDialog(stage);

        if(file!=null){
            Image image=new Image(file.toURI().toString(), 30, 30, false, true);
            profilo.setFill(new ImagePattern(image));
        }
        else{}

    }

    @FXML
    void logout(ActionEvent event){
        Home.getInstance().createLogin();
    }

    @FXML
    void chiudi_app(ActionEvent event){
        Platform.exit();
    }

    @FXML
    void close_menu(ActionEvent event){
        finestra.setVisible(false);
    }

    @FXML
    void animazione(ActionEvent event){Home.getInstance().createAnimazione();}

    @FXML
    void azione(ActionEvent event){
        Home.getInstance().createAzione();
    }

    @FXML
    void commedia(ActionEvent event){Home.getInstance().createCommedia();}

    @FXML
    void fantascienza(ActionEvent event){Home.getInstance().createFantascienza();}

    public void setUsername(String user){this.welcome.setText("Benvenuto, " + user );}
}
