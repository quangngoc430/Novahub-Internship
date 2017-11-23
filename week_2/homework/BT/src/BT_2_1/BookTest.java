package BT_2_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
	Author author = new Author("ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
	
	@Test
	public void TestConstructorWithThreeArguments() {
		Book book = new Book("Java core", author, 600000);
		
		assertEquals("Java core", book.getName());
		assertEquals("ngoc", book.getAuthor().getName());
		assertEquals("ngoc.bui150019@vnuk.edu.vn", book.getAuthor().getEmail());
		assertEquals('m', book.getAuthor().getGender());
		assertEquals(600000, book.getPrice(), 2);
	}
	
	@Test
	public void TestConstructorWithFourArguments() {
		Book book = new Book("Java advanced", author, 1200000, 10);
		
		assertEquals("Java advanced", book.getName());
		assertEquals("ngoc", book.getAuthor().getName());
		assertEquals("ngoc.bui150019@vnuk.edu.vn", book.getAuthor().getEmail());
		assertEquals('m', book.getAuthor().getGender());
		assertEquals(1200000, book.getPrice(), 2);
		assertEquals(10, book.getQty());
	}
	
	@Test
	public void testSetAuthor() {
		Book book = new Book("book", author, 100000);
		Author author = new Author("Thanh", "soziha@gmail.com", 'm');
		book.setAuthor(author);
		
		assertEquals("Thanh", book.getAuthor().getName());
		assertEquals("soziha@gmail.com", book.getAuthor().getEmail());
		assertEquals('m', book.getAuthor().getGender());
	}
	
	@Test
	public void testGetAuthor() {
		Book book = new Book("Writing task 1", author, 250000, 10);
		
		assertEquals("ngoc", book.getAuthor().getName());
		assertEquals("ngoc.bui150019@vnuk.edu.vn", book.getAuthor().getEmail());
		assertEquals('m', book.getAuthor().getGender());
	}
	
	@Test
	public void testSetName() {
		Book book = new Book("Speaking 1", author, 105000, 15);
		book.setName("Speaking part 1");
		
		assertEquals("Speaking part 1", book.getName());
	}
	
	@Test
	public void testGetName() {
		Book book = new Book("Writing task 2", author, 300000, 20);
		
		assertEquals(300000, book.getPrice(), 2);
	}
	
	@Test
	public void testSetPrice() {
		Book book = new Book("Speaking part 2", author, 130000, 25);
		book.setPrice(100000);
		
		assertEquals(100000, book.getPrice(), 2);
	}
	
	@Test
	public void testGetPrice() {
		Book book = new Book("Speaking part 3", author, 160000, 12);
		
		assertEquals(160000, book.getPrice(), 2);
	}
	
	@Test
	public void testSetQty() {
		Book book = new Book("Ielts general", author, 150000, 17);
		book.setQty(17);
		
		assertEquals(17, book.getQty());
	}
	
	@Test
	public void testGetQty() {
		Book book = new Book("Ielts listening", author, 3700000, 20);
		
		assertEquals(20, book.getQty());
	}
	
	@Test
	public void testGetAuthorName() {
		Book book = new Book("World war II", author, 250000, 300);
		
		assertEquals("ngoc", book.getAuthorName());
	}
	
	@Test
	public void testGetAuthorEmail() {
		Book book = new Book("World war I", author, 200000, 400);
		
		assertEquals("ngoc.bui150019@vnuk.edu.vn", book.getAuthorEmail());
	}
	
	@Test
	public void testGetAuthorGender() {
		Book book = new Book("C++ data structure", author, 305000, 23);
		
		assertEquals('m', book.getAuthorGender());
	}
	
	@Test
	public void testToString() {
		Book book = new Book("Java core", author, 400000, 40);
		
		assertEquals("Book[name=Java core,Author[name=ngoc,email=ngoc.bui150019@vnuk.edu.vn,gender=m],price=400000.0,qty=40]", book.toString());
	}
}
