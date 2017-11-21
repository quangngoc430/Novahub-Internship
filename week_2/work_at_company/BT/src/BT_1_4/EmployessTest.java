package BT_1_4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployessTest {
	
	@Test
	public void testDefaultConstructor() {
		Employee employee = new Employee();
		employee.setId(0);
		employee.setFirstName("Ngoc");
		employee.setLastName("Bui Lam Quang");
		employee.setSalary(30000000);
		
		assertEquals(0, employee.getId());
		assertEquals("Ngoc", employee.getFirstName());
		assertEquals("Bui Lam Quang", employee.getLastName());
		assertEquals(30000000, employee.getSalary());
	}
	
	@Test
	public void testConstructor() {
		Employee employee = new Employee(1, "Ny", "Dieu", 20000000);
		
		assertEquals(1, employee.getId());
		assertEquals("Ny", employee.getFirstName());
		assertEquals("Dieu", employee.getLastName());
		assertEquals(20000000, employee.getSalary());
	}
	
	@Test
	public void testSetId() {
		Employee employee = new Employee();
		employee.setId(1);
		
		assertEquals(1, employee.getId());
	}
	
	@Test
	public void testGetId() {
		Employee employee = new Employee(2, "Ngoc", "Bui", 234560);
		
		assertEquals(2, employee.getId());		
	}
	
	@Test
	public void testSetFirstName() {
		Employee employee = new Employee();
		employee.setFirstName("Ngoc");
		
		assertEquals("Ngoc", employee.getFirstName());
	}
	
	@Test
	public void testGetFirstName() {
		Employee employee = new Employee(3, "Hung", "Duong", 305000);
		
		assertEquals("Hung", employee.getFirstName());
	}
	
	@Test
	public void testSetLastName() {
		Employee employee = new Employee();
		employee.setLastName("Bui Lam Quang");
		
		assertEquals("Bui Lam Quang", employee.getLastName());
	}
	
	@Test
	public void testGetLastName() {
		Employee employee = new Employee(4, "Hung", "Lee", 500000);
		
		assertEquals("Lee", employee.getLastName());
	}
	
	@Test
	public void testSetSalary() {
		Employee employee = new Employee();
		employee.setSalary(23000000);
		
		assertEquals(23000000, employee.getSalary());
	}
	
	@Test
	public void testGetSalary() {
		Employee employee = new Employee(5, "Minh", "Than", 40000000);
		
		assertEquals(40000000, employee.getSalary());
	}
	
	@Test
	public void TestGetAnnualSalary() {
		Employee employee = new Employee();
		employee.setId(0);
		employee.setFirstName("Ngoc");
		employee.setLastName("Bui Lam Quang");
		employee.setSalary(30000000);
		
		assertEquals(12 * 30000000, employee.getAnnualSalary());
	}
	
	@Test
	public void testRaiseSalary() {
		Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Kieu");
		employee.setLastName("Thuy");
		employee.setSalary(1000000);
		
		assertEquals(200000 + 1000000, employee.raiseSalary(20));
	}
	
	@Test
	public void testToString() {
		Employee employee = new Employee();
		employee.setId(4);
		employee.setFirstName("Minh");
		employee.setLastName("Than Quang");
		employee.setSalary(15000000);
		
		assertEquals("Employee[id=4,name=Minh Than Quang,salary=15000000]", employee.toString());
	}
}
