package unical.demacs.informatica.it.progetto.model;

public class Prefe{
    private String nome;

    public Prefe(String nome){
        if(nome==null){
        }
        if(nome.isBlank()){
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

