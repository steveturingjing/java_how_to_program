package com.it.assignment.atm.domain;

public class User 
{
	private String account;
	
	private String pin;
	
	private double balance;	
	
	public void setAccount(String account)
	{
		this.account = account;
	}
	public String getAccount()
	{
		return this.account;
	}
	public void setPin(String pin)
	{
		this.pin = pin;
	}
	public String getPin()
	{
		return this.pin;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	public User()    //Constructor
	{
		
	}
	
	public User(String account, String pin, double balance)   //Constructor with parameter
	{
		this.setAccount(account);
		this.setPin(pin);
		this.setBalance(balance);
	}
	
	
	
	
	
	
	
	
	
}
