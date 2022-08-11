package unical.demacs.informatica.it.progetto.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class FilmHandler {

    private final ObservableList<film> ossFilm;


    private static FilmHandler instance= null;

    private FilmHandler(){
        ossFilm= FXCollections.observableArrayList();
    }

    public static FilmHandler getInstance(){
        if(instance==null){
            instance=new FilmHandler();
        }
        return instance;
    }

    public ObservableList<film> getFilm(){return ossFilm;}

    public boolean addFilm(film f){
        ossFilm.add(f);
        return true;
    }

    public void svuotare(){
        this.ossFilm.clear();
    }

}
