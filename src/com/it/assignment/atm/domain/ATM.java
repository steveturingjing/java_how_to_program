package com.it.assignment.atm.domain;

import java.util.Scanner;

public class ATM
{
	public String[] welcome()
	{
		System.out.println("Welcome");
		
		String[] info = new String[2]; //array if we need to save two inputs here, we might want to create an array to save them.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your account number");
		
		info[0] = input.next();
		
		System.out.print("Please enter your pin number");
		
		info[1] = input.next();
		
		input.close();
		
		return info;	
	}
	
	public boolean auth(String account, String pin)
	{
		String realAccount = "12345";            //Set real account and pin number first.
		
		String realPin = "12345";
		
		boolean flag = false;                    //Set default boolean into false.
		
		if(realAccount.equals(account) && realPin.equals(pin))
		{
			flag = true;
		}
		else if(realAccount.equals(account))
		{
			System.out.print("You have entered the incorrect pin number");
			
			this.welcome();
		}
		else 
		{
			System.out.print("You have entered the incorrect account number");
			
			this.welcome();
		}	
		return flag;	
	}
		
	public int showMenu()
	{
		int option = 0;                         //Set default option into zero.
		
		System.out.print("Please select your option:\n 1. Show my balance\n 2. Withdraw cash\n 3. Deposit funds\n 4. Exit");
		
		Scanner input = new Scanner(System.in);
		
		option = input.nextInt();
	
		input.close();
		
		return option;
	}
	
	
	public double showBalance(double balance)
	{
		System.out.print("Your current balance is: " + balance);
		
		return balance;
	}
	
	public double withdraw(double balance)
	{
		double cash = 0;
		
		System.out.print("Please enter the amount of cash you want to withdraw: ");
		
		Scanner input = new Scanner(System.in);
		
		cash = input.nextInt();
		
		input.close();
		
		if(cash > 0 && balance > 0 && cash <= balance)
		{
			balance -= cash;
		}
		else if(cash <= 0)
		{
			System.out.print("You cannot enter the amount below or equals to zero.");
			
		}
		else if(cash > balance || balance <= 0)
		{
			System.out.print("Insufficient fund!");
		}
		
		return this.showBalance(balance);	
	}

	
	public double deposit(double balance)
	{
		double cash = 0;
		
		System.out.print("Please enter the amount of cash you want to deposit: ");
		
		Scanner input = new Scanner(System.in);
		
		cash = input.nextInt();
		
		input.close();
		
		if(cash > 0)
		{
			balance += cash;
		}
		else if(cash <= 0)
		{
			System.out.print("You cannot enter the amount below or equals to zero.");
			
		}
				
		return this.showBalance(balance);	
	}
	
	public void exit()
	{
		System.out.print("Thank you.");
	}
}
