package com.cg.payoll.main;
import java.util.ArrayList;
import java.util.List;

import com.cg.payoll.daos.EmployeeDAO;
import com.cg.payoll.daos.EmployeeDAOImpl;
import com.cg.payoll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payoll.pojos.BankDetail;
import com.cg.payoll.pojos.Employee;
import com.cg.payoll.pojos.Salary;
import com.cg.payroll.services.EmployeeService;
import com.cg.payroll.services.EmployeeServiceImpl;
import com.cg.payroll.utils.Utils;
public class MainClass {
	public static void main(String[] args) throws EmployeeDetailsNotFoundException {
			EmployeeService employeeService = new EmployeeServiceImpl();
			
			BankDetail bankDetail = new BankDetail(111, "HDFC", "hdfc00023");
			
			Salary salary = new Salary(30000, 4000);
			
			Employee employee1 =  new Employee("Satish", "Mahajan", "17-05-2017", "08-08-1983", "Sr .Con", "PF/223/332", "AWZPM2397K", "C", salary, bankDetail);
			
			Employee employee2 =  new Employee("Manish", "Mahajan", "17-05-2017", "08-08-1983", "Sr .Con", "PF/223/332", "AWZPM2397K", "C", salary, bankDetail);

			employee1 = employeeService.acceptEmployeeDetails(employee1);
			
			employee2 = employeeService.acceptEmployeeDetails(employee2);


	}
}