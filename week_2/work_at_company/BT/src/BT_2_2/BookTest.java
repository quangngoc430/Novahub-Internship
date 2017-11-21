package BT_2_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
	Author[] authors = new Author[2];
	Author author_1 = new Author("ngoc", "ngoc.bui150019@vnuk.edu.vn", 'm');
	Author author_2 = new Author("thanh", "saoziha@gmail.com", 'f');
	
	@Test
	public void TestConstructorWithThreeArguments() {
		authors[0] = author_1;
		authors[1] = author_2;
		
		Book book = new Book("Java core", authors, 600000);
		
		assertEquals("Java core", book.getName());
		assertEquals("ngoc", book.getAuthors()[0].getName());
		assertEquals("thanh", book.getAuthors()[1].getName());
		assertEquals("ngoc.bui150019@vnuk.edu.vn", book.getAuthors()[0].getEmail());
		assertEquals("saoziha@gmail.com", book.getAuthors()[1].getEmail());
		assertEquals('m', book.getAuthors()[0].getGender());
		assertEquals('f', book.getAuthors()[1].getGender());
		assertEquals(600000, book.getPrice(), 2);
	}
	
	@Test
	public void TestConstructorWithFourArguments() {	
		authors[0] = author_1;
		authors[1] = author_2;
		
		Book book = new Book("Java core", authors, 600000, 24);
		
		assertEquals("Java core", book.getName());
		assertEquals("Author[name=ngoc,email=ngoc.bui150019@vnuk.edu.vn,gender=m]", book.getAuthors()[0].toString());
		assertEquals("Author[name=thanh,email=saoziha@gmail.com,gender=f]", book.getAuthors()[1].toString());
		assertEquals(600000, book.getPrice(), 2);
		assertEquals(24, book.getQty());
	}
	
	@Test
	public void testSetAuthors() {
		Author[] newAuthors = new Author[2];
		Author authorExample1 = new Author("author1", "author1@mail.com", 'm');
		Author authorExample2 = new Author("author2", "author2@mail.com", 'f');
		
		newAuthors[0] = authorExample1;
		newAuthors[1] = authorExample2;
		
		Book book = new Book("book", authors, 100000);
		book.setAuthors(newAuthors);
		
		assertEquals("Author[name=author1,email=author1@mail.com,gender=m]", book.getAuthors()[0].toString());
		assertEquals("Author[name=author2,email=author2@mail.com,gender=f]", book.getAuthors()[1].toString());
	}
	
	@Test
	public void testGetAuthor() {
		authors[0] = author_1;
		authors[1] = author_2;
		
		Book book = new Book("Writing task 1", authors, 250000, 10);
		
		assertEquals("Author[name=ngoc,email=ngoc.bui150019@vnuk.edu.vn,gender=m]", book.getAuthors()[0].toString());
		assertEquals("Author[name=thanh,email=saoziha@gmail.com,gender=f]", book.getAuthors()[1].toString());
	}
	
	@Test
	public void testSetName() {
		Book book = new Book("Speaking 1", authors, 105000, 15);
		book.setName("Speaking part 1");
		
		assertEquals("Speaking part 1", book.getName());
	}
	
	@Test
	public void testGetName() {
		Book book = new Book("Writing task 2", authors, 300000, 20);
		
		assertEquals(300000, book.getPrice(), 2);
	}
	
	@Test
	public void testSetPrice() {
		Book book = new Book("Speaking part 2", authors, 130000, 25);
		book.setPrice(100000);
		
		assertEquals(100000, book.getPrice(), 2);
	}
	
	@Test
	public void testGetPrice() {
		Book book = new Book("Speaking part 3", authors, 160000, 12);
		
		assertEquals(160000, book.getPrice(), 2);
	}
	
	@Test
	public void testSetQty() {
		Book book = new Book("Ielts general", authors, 150000, 17);
		book.setQty(17);
		
		assertEquals(17, book.getQty());
	}
	
	@Test
	public void testGetQty() {
		Book book = new Book("Ielts listening", authors, 3700000, 20);
		
		assertEquals(20, book.getQty());
	}
	
	@Test
	public void testGetAuthorNames() {
		authors[0] = author_1;
		authors[1] = author_2;
		
		Book book = new Book("World war II", authors, 250000, 300);
		
		assertEquals("ngoc,thanh", book.getAuthorNames());
	}
	
	@Test
	public void testToString() {
		authors[0] = author_1;
		authors[1] = author_2;
		
		Book book = new Book("Java core", authors, 400000, 40);
		
		assertEquals("Book[name=Java core,authors={Author[name=ngoc,email=ngoc.bui150019@vnuk.edu.vn,gender=m],Author[name=thanh,email=saoziha@gmail.com,gender=f]},price=400000.0,qty=40]", book.toString());
	}
}
