////////////////////////////////////////////////////////////////////
// Oscar Costantini 1192078
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {

    public enum type {
        Budino,
        Gelato,
        Bevanda
    }

    private type tipo;
    private String nome;
    private double prezzo;

    public MenuItem(type type, String name, double price) {
        this.tipo = type;
        this.nome = name;
        this.prezzo = price;
    }

    public type getItemTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}