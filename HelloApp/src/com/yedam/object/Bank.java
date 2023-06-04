package com.yedam.object;


//private <-> public.

public class Bank {
	String accountNO; // unique. 356-0792-7975-33 농협
	String owner; // 계좌주	홍길동
	int balance; // 잔고. 1000
	public String getAccountNo() {
		return accountNO;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//메소드. getter/setter
	
}
