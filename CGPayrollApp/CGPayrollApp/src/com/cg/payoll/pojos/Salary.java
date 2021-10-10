package com.cg.payoll.pojos;
public class Salary {
	private int basicSalary,hra,ta,da,otherAllowance,monthlyTax,netSalary,epf;
	public Salary() {}
	
	
	public Salary(int basicSalary, int epf) {
		super();
		this.basicSalary = basicSalary;
		this.epf = epf;
	}


	public Salary(int basicSalary, int hra, int ta, int da, int otherAllowance, int monthlyTax, int netSalary,
			int epf) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.ta = ta;
		this.da = da;
		this.otherAllowance = otherAllowance;
		this.monthlyTax = monthlyTax;
		this.netSalary = netSalary;
		this.epf = epf;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	
	
	
}
