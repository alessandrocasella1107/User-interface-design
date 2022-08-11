package unical.demacs.informatica.it.progetto.model;

public class film {
    private String nome;

    public film(String nome){
        if(nome==null){
            throw new IllegalArgumentException("Un campo non può essere nullo");
        }
        if(nome.isBlank()){
            throw  new IllegalArgumentException("Un parametro non può essere vuoto");
        }
        this.nome=nome;

    }

    public String getNome(){
        return nome;
    }


    @Override
    public String toString(){
        return nome;
    }



}
