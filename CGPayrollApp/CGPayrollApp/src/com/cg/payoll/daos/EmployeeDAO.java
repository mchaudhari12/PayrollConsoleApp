package com.cg.payoll.daos;
import java.util.List;
import com.cg.payoll.pojos.Employee;
public interface EmployeeDAO{
	Employee save(Employee associate);
	boolean update(Employee associate);
	Employee findOne(int Id) ;
	List<Employee>  findAll();
}