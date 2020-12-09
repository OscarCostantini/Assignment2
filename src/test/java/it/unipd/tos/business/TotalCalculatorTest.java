package it.unipd.tos.business;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import it.unipd.tos.business.exception.TakeAwayBillException;

public class TotalCalculatorTest {

	TotalCalculator calcola;
	User user;
	double totale;
	List<MenuItem> list;
	private static final double Diff = 1e-3;

	@Before
	public void setup() {
		calcola = new TotalCalculator();
		totale = 0.00;
		list = new ArrayList<MenuItem>();
		user = new User("Oscar","Costantini",24);
	}

		@Test(expected = TakeAwayBillException.class) 
	    public void listNulltTest() throws TakeAwayBillException {
	        list = null;
	        totale = calcola.getOrderPrice(list,user);
	    }

	@Test
	public void sumTest() throws TakeAwayBillException {

		list.add(new MenuItem(MenuItem.type.Gelato, "CoppaNafta", 5.00));
	    list.add(new MenuItem(MenuItem.type.Gelato, "Biancaneve", 7.50));
	    list.add(new MenuItem(MenuItem.type.Bevanda, "CocaCola", 3));
	    list.add(new MenuItem(MenuItem.type.Budino, "Pinguino", 3));

        totale = calcola.getOrderPrice(list,user);

        assertEquals(18.50,totale,Diff);
    }

	@Test(expected = TakeAwayBillException.class) 
		public void nullInListTest() throws TakeAwayBillException {
			list.add(null);
		    totale = calcola.getOrderPrice(list,user);
		    }
}