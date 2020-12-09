package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MenuItemTest {

	private MenuItem menuitem;
	private static final double Diff = 1e-3;

	@Before
	public void setup() {
		menuitem = new MenuItem(MenuItem.type.Budino,"CremaCatalana",4.50);
	}

	@Test
    public void getItemTipoTest() {
        assertEquals(MenuItem.type.Budino, menuitem.getItemTipo());
    }

	@Test
    public void getNomeTest() {
        assertEquals("CremaCatalana", menuitem.getNome());
    }

    @Test
    public void getPrezzoTest() {
        assertEquals(4.50, menuitem.getPrezzo(),Diff);
    }

    @Test
    public void PrezzoNegativoTest() {
    	boolean b = true;
		if(menuitem.getPrezzo()<0)
			b = false;
		assertEquals(true, b);
    }

}