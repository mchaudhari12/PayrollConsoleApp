package com.cg.payoll.pojos;
public class Employee {
	private int  id;
	private String firstName, lastName, dateOfJoining, dateOfBirth, designation,pfNo, pancardno, grade;
	private Salary salary;
	
	

	private BankDetail bankDetail;
	
	public Employee() {}
	
	public Employee(int id, String firstName, String lastName, String dateOfJoining, String dateOfBirth,
			String designation, String pfNo, String pancardno, String grade) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.pfNo = pfNo;
		this.pancardno = pancardno;
		this.grade = grade;
	}
	public Employee( String firstName, String lastName, String dateOfJoining, String dateOfBirth,
			String designation, String pfNo, String pancardno, String grade, Salary salary, BankDetail bankDetail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.pfNo = pfNo;
		this.pancardno = pancardno;
		this.grade = grade;
		this.salary = salary;
		this.bankDetail = bankDetail;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPfNo() {
		return pfNo;
	}
	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}
	public Salary getSalary() {
		return salary;
	}
	
	public BankDetail getBankDetail() {
		return bankDetail;
	}

	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfJoining="
				+ dateOfJoining + ", dateOfBirth=" + dateOfBirth + ", designation=" + designation + ", pfNo=" + pfNo
				+ ", pancardno=" + pancardno + ", grade=" + grade + ", salary=" + salary + ", bankDetail=" + bankDetail
				+ "]";
	}
	
}