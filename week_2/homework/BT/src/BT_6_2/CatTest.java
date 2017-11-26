package BT_6_2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class CatTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Test
	public void testGreeting() {
		Cat cat = new Cat();
		cat.greeting();
	}
}
