package BT_4_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void testDefaultConstructor() {
		Person person = new Person();
		person.setName("ngoc");
		person.setAddress("Da Nang");
		
		assertEquals("ngoc", person.getName());
		assertEquals("Da Nang", person.getAddress());
	}
	
	@Test
	public void testConstructor() {
		Person person = new Person("Ny", "Quang Nam");
		
		assertEquals("Ny", person.getName());
		assertEquals("Quang Nam", person.getAddress());
	}
	
	@Test
	public void testSetName() {
		Person person = new Person();
		person.setName("Ngoc Bui");
		
		assertEquals("Ngoc Bui", person.getName());
	}
	
	@Test
	public void testGetName() {
		Person person = new Person();
		person.setName("Hai");
		
		assertEquals("Hai", person.getName());
	}
	
	@Test
	public void testSetAddress() {
		Person person = new Person();
		person.setAddress("Quang Nam");
		
		assertEquals("Quang Nam", person.getAddress());
	}
	
	@Test
	public void testGetAddress() {
		Person person = new Person();
		person.setAddress("Quang Tri");
		
		assertEquals("Quang Tri", person.getAddress());
	}
	
	@Test
	public void testToString() {
		Person person = new Person("Quang Ngoc", "Da Nang");
		
		assertEquals("Person[name=Quang Ngoc,address=Da Nang]", person.toString());
	}
}


















