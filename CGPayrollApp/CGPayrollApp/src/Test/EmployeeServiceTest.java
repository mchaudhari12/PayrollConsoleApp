package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.payoll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payoll.pojos.BankDetail;
import com.cg.payoll.pojos.Employee;
import com.cg.payoll.pojos.Salary;
import com.cg.payroll.services.EmployeeService;
import com.cg.payroll.services.EmployeeServiceImpl;

import junit.framework.Assert;

class EmployeeServiceTest {
	
	EmployeeService employeeService = new EmployeeServiceImpl();

	@BeforeEach
	public void setup() {
		BankDetail bankDetail = new BankDetail(111, "HDFC", "hdfc00023");
		
		Salary salary = new Salary(30000, 4000);
		
		Employee employee =  new Employee("Satish", "Mahajan", "17-05-2017", "08-08-1983", "Sr .Con", "PF/223/332", "AWZPM2397K", "C", salary, bankDetail);
		
		Employee employee1 =  new Employee("Manish", "Mahajan", "17-05-2017", "08-08-1983", "Sr .Con", "PF/223/332", "AWZPM2397K", "C", salary, bankDetail);
	
		EmployeeService employeeService = new EmployeeServiceImpl();

		employee = employeeService.acceptEmployeeDetails(employee);
		
		employee1 = employeeService.acceptEmployeeDetails(employee1);
	}
	@Test
	void TestGetAllEmployeeDetails() {

		assertEquals(2, employeeService.getAllEmployeeDetails().size());
		
	}
	
	@Test
	void TestGetEmployeeDetails() {

		try {
			assertEquals(101,employeeService.getEmployeeDetails(103).getId());
		} catch (EmployeeDetailsNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	void TestCalculateNetSalary() {
		
		try {
			int calculateNetSalary = employeeService.calculateNetSalary(101);
			assertEquals(26000,calculateNetSalary );
		} catch (EmployeeDetailsNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
