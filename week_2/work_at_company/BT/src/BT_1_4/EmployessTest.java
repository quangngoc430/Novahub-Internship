package BT_1_4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployessTest {
	
	@Test
	public void TestDefaultConstructor() {
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
	public void TestConstructor() {
		Employee employee = new Employee(1, "Ny", "Dieu", 20000000);
		
		assertEquals(1, employee.getId());
		assertEquals("Ny", employee.getFirstName());
		assertEquals("Dieu", employee.getLastName());
		assertEquals(20000000, employee.getSalary());
	}
	
	@Test
	public void TestSetId() {
		Employee employee = new Employee();
		employee.setId(1);
		
		assertEquals(1, employee.getId());
	}
	
	@Test
	public void TestSetFirstName() {
		Employee employee = new Employee();
		employee.setFirstName("Ngoc");
		
		assertEquals("Ngoc", employee.getFirstName());
	}
	
	@Test
	public void TestSetLastName() {
		Employee employee = new Employee();
		employee.setLastName("Bui Lam Quang");
		
		assertEquals("Bui Lam Quang", employee.getLastName());
	}
	
	@Test
	public void TestSetSalary() {
		Employee employee = new Employee();
		employee.setSalary(23000000);
		
		assertEquals(23000000, employee.getSalary());
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
	public void TestRaiseSalary() {
		Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Kieu");
		employee.setLastName("Thuy");
		employee.setSalary(1000000);
		
		assertEquals(200000 + 1000000, employee.raiseSalary(20));
	}
	
	@Test
	public void TestToString() {
		Employee employee = new Employee();
		employee.setId(4);
		employee.setFirstName("Minh");
		employee.setLastName("Than Quang");
		employee.setSalary(15000000);
		
		assertEquals("Employee[id=4,name=Minh Than Quang,salary=15000000]", employee.toString());
	}
}
