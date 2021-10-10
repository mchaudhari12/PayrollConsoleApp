package com.cg.payroll.services;
import java.util.ArrayList;
import java.util.List;
import com.cg.payoll.daos.EmployeeDAO;
import com.cg.payoll.daos.EmployeeDAOImpl;
import com.cg.payoll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payoll.pojos.Employee;
import com.cg.payoll.pojos.Salary;
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO  employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao= new EmployeeDAOImpl();
	}
	

	@Override
	public Employee acceptEmployeeDetails(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public int calculateNetSalary(int Id) throws EmployeeDetailsNotFoundException {
	
		int basicSalary=0,hra=0,ta=0,da=0,otherAllowance=0,monthlyTax=0,netSalary=0,epf=0;
		Employee findOne = employeeDao.findOne(Id);
		basicSalary = findOne.getSalary().getBasicSalary();
		epf = findOne.getSalary().getEpf();
		hra = findOne.getSalary().getHra();
		ta = findOne.getSalary().getTa();
		da = findOne.getSalary().getDa();
		otherAllowance = findOne.getSalary().getOtherAllowance();
		monthlyTax = findOne.getSalary().getMonthlyTax();

		netSalary = basicSalary+hra+ta+da+otherAllowance-epf-monthlyTax;
		System.out.println("netsalary for employee id : "+findOne.getId()+" is "+netSalary);
	return netSalary;
	}

	@Override
	public Employee getEmployeeDetails(int Id) throws EmployeeDetailsNotFoundException {
		Employee findOne = employeeDao.findOne(Id);
		
		return findOne;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> findAll = employeeDao.findAll();
		return findAll;

	}

}
