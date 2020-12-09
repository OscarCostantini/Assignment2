////////////////////////////////////////////////////////////////////
// Oscar Costantini 1192078
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import it.unipd.tos.business.exception.TakeAwayBillException;

public class TotalCalculator implements TakeAwayBill {
    public double getOrderPrice(List < MenuItem > items, User user) throws TakeAwayBillException {
        double totale = 0.0;        
        int numGel=0;
        MenuItem GelMenoCost=null;
        double TotGel = 0;

        if (items == null) {
            throw new TakeAwayBillException("Lista vuota");
        }

        if (items.contains(null)) {
            throw new TakeAwayBillException("nessun elemento nella lista");
        }
        for(MenuItem i: items) {
            totale +=i.getPrezzo();
            if (i.getItemTipo() == MenuItem.type.Gelato) {
                numGel++;
                TotGel += i.getPrezzo();

                if ((GelMenoCost == null) || (GelMenoCost.getPrezzo() > i.getPrezzo())) {
                    GelMenoCost = i;
                }
            }
            if (i.getItemTipo() == MenuItem.type.Budino) {
                TotGel += i.getPrezzo();
                }
            
            } 
            if (numGel > 5) {
                totale -= GelMenoCost.getPrezzo() * 0.5;
            }
            if (TotGel > 50) {
                totale -= totale * 0.1;
                }
        return totale;     
    }
}