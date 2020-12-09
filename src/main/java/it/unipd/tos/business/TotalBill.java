////////////////////////////////////////////////////////////////////
// Oscar Costantini 1192078
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;
import java.time.LocalTime;

import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;

public class TotalBill {

    private List < MenuItem > lista;
    private User user;
    private LocalTime tempo;
    private double prezzo;

    public TotalBill(List < MenuItem > list, User user, LocalTime time, double price) {
        this.lista = list;
        this.user = user;
        this.tempo = time;
        this.prezzo = price;
    }

    public List < MenuItem > getLista() {
        return lista;
    }

    public User getUser() {
        return user;
    }

    public int getTempo() {
        return ((tempo.getHour() * 60 * 60) + (tempo.getMinute() * 60) + tempo.getSecond());
    }


    public double getPrice() {
        return prezzo;
    }

    public void changePrice(double p) {
        prezzo = p;
    }
}