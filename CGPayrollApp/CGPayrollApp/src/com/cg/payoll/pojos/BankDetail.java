package com.cg.payoll.pojos;
public class BankDetail {
	private int accountNo;
	private String bankName,ifsCode;
	public BankDetail() {}
	public BankDetail(int accountNo, String bankName, String ifsCode) {
		super();
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.ifsCode = ifsCode;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsCode() {
		return ifsCode;
	}
	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}
	@Override
	public String toString() {
		return "BankDetail [accountNo=" + accountNo + ", bankName=" + bankName + ", ifsCode=" + ifsCode + "]";
	}
}