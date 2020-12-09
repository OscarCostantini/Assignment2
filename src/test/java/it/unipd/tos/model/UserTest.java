package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;

	@Before
	public void setup() {
		user = new User("Oscar","Costantini",24);
	}

	@Test
	public void getNomeTest() {
		assertEquals("Oscar", user.getNome());
	}

	@Test
	public void getCognomeTest() {
		assertEquals("Costantini", user.getCognome());
	}

	@Test
	public void getEtaTest() {
		assertEquals(24, user.getEta());
	}

	@Test
	public void invalidEtaTest() {
		boolean b = true;
		if(user.getEta()<0)
		b = false;
		assertEquals(true, b);
	}
}