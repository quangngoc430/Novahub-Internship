package BT_4_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
	
	@Test
	public void testDefaultConstructor() {
		Student student = new Student();
		student.setProgram("Full Degree");
		student.setFee(50000000);
		student.setYear(3);
		
		assertEquals("Full Degree", student.getProgram());
		assertEquals(50000000, student.getFee(), 2);
		assertEquals(3, student.getYear());
	}
	
	@Test
	public void testConstructor() {
		Student student = new Student("Ngoc", "Da Nang", "Intern program", 3, 15000000);
		
		assertEquals("Ngoc", student.getName());
		assertEquals("Da Nang", student.getAddress());
		assertEquals("Intern program", student.getProgram());
		assertEquals(15000000, student.getFee(), 2);
		assertEquals(3, student.getYear());
	}
	
	@Test
	public void testGetFee() {
		Student student = new Student("Ngoc", "Da Nang", "Intern program", 3, 157000.50);
		
		assertEquals(157000.50, student.getFee(), 2);
	}
	
	@Test
	public void testSetFee() {
		Student student = new Student();
		student.setFee(1005000.50);
		
		assertEquals(1005000.50, student.getFee(), 2);
	}

	@Test
	public void testGetProgram() {
		Student student = new Student("Ngoc", "Da Nang", "Intern program", 3, 157000.50);
		
		assertEquals("Intern program", student.getProgram());
	}
	
	@Test
	public void testSetProgram() {
		Student student = new Student();
		student.setProgram("Full degree program");
		
		assertEquals("Full degree program", student.getProgram());
	}

	@Test
	public void testGetYear() {
		Student student = new Student("Ngoc", "Da Nang", "Intern program", 3, 157000.50);
		
		assertEquals(3, student.getYear());
	}
	
	@Test
	public void testSetYear() {
		Student student = new Student();
		student.setYear(1);
		
		assertEquals(1, student.getYear());
	}
	
	@Test
	public void testToString() {
		Student student = new Student("Ngoc", "Da Nang", "Intern program", 3, 157000.50);
		
		assertEquals("Student[Person[name=Ngoc,address=Da Nang],program=Intern program,year=3,fee=157000.50]", student.toString());
	}
}























