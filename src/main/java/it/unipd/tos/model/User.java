////////////////////////////////////////////////////////////////////
// Oscar Costantini 1192078
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class User {
    private String nome;
    private String cognome;
    private int eta;

    public User(String name, String surname, int age){
        this.nome = name;
        this.cognome = surname;
        this.eta = age;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getEta(){
        return eta;
    }
}