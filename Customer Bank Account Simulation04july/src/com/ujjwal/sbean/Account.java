package com.ujjwal.sbean;

public class Account
{
	private int accountNo ;
	private double balance ;
	private float interestRate ;
	private Customer customer;
	public Account()
	{
		super();
	}
	
	public void deposit(double amount)
	{
		this.balance=this.balance + amount;
	}
	public void withdraw(double amount)
	{
		this.balance=this.balance - amount;
	}
//Getter and Setter
	public int getAccountNo() 
	{
		return accountNo;
	}

	public void setAccountNo(int accountNo) 
	{
		this.accountNo = accountNo;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public float getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(float interestRate) 
	{
		this.interestRate = interestRate;
	}

	public Customer getCustomer() 
	{
		return customer;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + ", interestRate=" + interestRate
				+ ", customer=" + customer + "]";
	}
	
	
	

}
