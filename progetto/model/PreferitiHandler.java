package unical.demacs.informatica.it.progetto.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Objects;

public class PreferitiHandler {
    public final ObservableList<Prefe> ossPrefe;


    private static PreferitiHandler instance= null;

    private PreferitiHandler(){
        ossPrefe= FXCollections.observableArrayList();
    }



    public static PreferitiHandler getInstance(){
        if(instance==null){
            instance = new PreferitiHandler();
        }
        return instance;
    }

    public ObservableList<Prefe> getFilm(){return ossPrefe;}

    public boolean addPrefe(Prefe p){
        for (Prefe prefe : ossPrefe) {
            if (Objects.equals(prefe.getNome(), p.getNome())) {
                return false;
            }
        }
        ossPrefe.add(p);
        return true;
    }

    public void svuotare(){
        this.ossPrefe.clear();
    }

}
