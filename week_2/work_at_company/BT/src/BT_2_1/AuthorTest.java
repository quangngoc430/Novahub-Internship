package BT_2_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuthorTest {

	@Test
	public void TestConstructor() {
		Author author = new Author("Ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
		
		assertEquals("Ngoc", author.getName());
		assertEquals("ngoc.bui150019@vnuk.edu.vn", author.getEmail());
		assertEquals('m', author.getGender());
	}
	
	@Test
	public void TestSetName() {
		Author author = new Author("Ngoc", "ngoc@gmail.com", 'm');
		author.setName("Ngoc Bui");
		
		assertEquals("Ngoc Bui", author.getName());
	}
	
	@Test
	public void TestSetEmail() {
		Author author = new Author("Ngoc", "ngoc@gmail.com", 'm');
		author.setEmail("ngoc.bui150019@vnuk.edu.vn");
		
		assertEquals("ngoc.bui150019@vnuk.edu.vn", author.getEmail());
	}
	
	@Test
	public void TestSetGeneder() {
		Author author = new Author("Dieu Ny", "ny@mail.com", 'm');
		author.setGender('f');
		
		assertEquals('f', author.getGender());
	}
	
	@Test
	public void TestGetName() {
		Author author = new Author("Dieu Ny", "ny@mail.com", 'm');
		
		assertEquals(author.getName(), author.getName());
	}
	
	@Test
	public void TestGetEmail() {
		Author author = new Author("Ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
		
		assertEquals("ngoc.bui150019@vnuk.edu.vn", author.getEmail());
	}

	@Test
	public void TestGetGender() {
		Author author = new Author("Ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
		
		assertEquals('m', author.getGender());
	}
}
