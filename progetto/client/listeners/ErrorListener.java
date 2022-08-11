package unical.demacs.informatica.it.progetto.client.listeners;

@FunctionalInterface
public interface ErrorListener {

    void onError(Exception e);
}
