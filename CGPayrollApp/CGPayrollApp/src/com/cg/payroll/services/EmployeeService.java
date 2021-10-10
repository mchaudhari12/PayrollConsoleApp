package com.cg.payroll.services;
import java.util.List;
import com.cg.payoll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payoll.pojos.Employee;
public interface EmployeeService {

	Employee acceptEmployeeDetails(Employee employee) ;
	
	int calculateNetSalary(int Id)throws EmployeeDetailsNotFoundException;

	Employee getEmployeeDetails(int Id)throws EmployeeDetailsNotFoundException ;

	List<Employee>   getAllEmployeeDetails();

}