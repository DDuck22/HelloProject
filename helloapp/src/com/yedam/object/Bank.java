package com.yedam.object;

public class Bank {
	private String accountNo; // unique. 11-23-1234
	private String owner; // 예금주 홍길동
	private int balance; // 잔고. 10000
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}

//	// 메소드. getter / setter
//	void setAccountNo(String acNo) {
//		accountNo = acNo;
//	}
//
//	String getAccountNo() {
//		return accountNo;
//	}
//
//	void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	String getOwner() {
//		return this.owner;
//	}
//
//	void setBalance(int balance) {
//		this.balance = balance;
//	}
//	
//	int getBalance() {
//		return this.balance;
//	}
}
