package com.cg.payoll.daos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cg.payoll.pojos.Employee;
import com.cg.payroll.utils.Utils;
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public Employee save(Employee employee) {
		employee.setId(Utils.EMPLOYEE_ID_COUNTER++);
		Utils.employeeData.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public boolean update(Employee employee) {
		Utils.employeeData.put(employee.getId(), employee);
		return false;
	}

	@Override
	public Employee findOne(int Id) {
		HashMap<Integer, Employee> employeeData = Utils.employeeData;
		Optional<Employee> findFirst = employeeData.values().stream().filter(x -> x.getId() ==Id).findAny();
		Employee employee = findFirst.get();
		System.out.println(employee);
		return employee;
	}

	
	@Override
	public List<Employee> findAll() {
		 
		HashMap<Integer, Employee> employeeData = Utils.employeeData;
		Collection<Employee> values = employeeData.values();
		ArrayList<Employee> listvalue = new ArrayList<Employee>(values);
		return listvalue;
	}

}
