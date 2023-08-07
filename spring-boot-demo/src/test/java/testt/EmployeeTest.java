package testt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.telstra.springbootdemo.model.Employee;

public class EmployeeTest {
	
	@Test
	public void getSalaryTest() {
		Employee emp1 = new Employee(1001,"Ram","Manger",5000);
		assertEquals(5000,emp1.getSalary());
		
		
		
	}
	@Test
	public void getNameTest() {
		Employee emp2 = new Employee(1001,"Ram","Manger",5000);
		assertEquals("Ram",emp2.getName());
		
		
	}

}
