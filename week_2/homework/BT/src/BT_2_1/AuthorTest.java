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
	public void testSetEmail() {
		Author author = new Author("Ngoc", "ngoc@gmail.com", 'm');
		author.setEmail("ngoc.bui150019@vnuk.edu.vn");
		
		assertEquals("ngoc.bui150019@vnuk.edu.vn", author.getEmail());
	}
	
	@Test
	public void testSetGeneder() {
		Author author = new Author("Dieu Ny", "ny@mail.com", 'm');
		author.setGender('f');
		
		assertEquals('f', author.getGender());
	}
	
	@Test
	public void testGetName() {
		Author author = new Author("Dieu Ny", "ny@mail.com", 'm');
		
		assertEquals(author.getName(), author.getName());
	}
	
	@Test
	public void testGetEmail() {
		Author author = new Author("Ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
		
		assertEquals("ngoc.bui150019@vnuk.edu.vn", author.getEmail());
	}

	@Test
	public void testGetGender() {
		Author author = new Author("Ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
		
		assertEquals('m', author.getGender());
	}
	
	@Test
	public void testToString() {
		Author author = new Author("Tran", "tran.ngoc@vnuk.edu.vn", 'f');
		
		assertEquals("Author[name=Tran,email=tran.ngoc@vnuk.edu.vn,gender=f]", author.toString());
	}
}
