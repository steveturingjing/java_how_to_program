package com.it.chapter06.classes;

public class Account
{
	
	private String name;
	
	private double balance;
	
	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public Account()
	{
		
	}
	
	

	public Account(String name0, double balance0)
	{
		this.setName(name0);
		this.balance = balance0;
	}
	
	
	
	
	
	public void setName(String name1)
	{
		String name2 = name1.substring(0, 3);
		
		if("NC-".equals(name2))
		{
			this.name = name1;
		}
		else
		{
			this.name = "NC-00001";
		}
		
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
