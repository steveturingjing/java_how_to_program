package com.it.assignment.atm.test;

import com.it.assignment.atm.domain.ATM;
import com.it.assignment.atm.domain.User;

public class ATMTest 
{
	public static void main(String[] args)
	{
		ATM atm1 = new ATM();             //Create a new ATM object.
		
		User user1 = new User("12345", "12345", 10000);        //Create a new user object.
		
		boolean loopFlag = true;          //LoopFlag
		
		String[] info1   = null;
		
		int option1      = 0;
		
		while(loopFlag)
		{
			info1 = atm1.welcome();
			
			boolean flagAuth = atm1.auth(info1[0], info1[1]);       //Auth method requires two arguments.
			
			if(flagAuth)
			{
				option1 = atm1.showMenu(); // 1. can method be accessed? 2. if the method needs arguments? 3. does method have values to return?
				
				while(loopFlag)
				{		
					if(option1 == 1)
					{
						user1.setBalance(atm1.showBalance(user1.getBalance()));
						
						option1 = atm1.showMenu();
						
					}
					else if(option1 == 2)
					{
						user1.setBalance(atm1.withdraw(user1.getBalance()));
						
						option1 = atm1.showMenu();
					}
					else if(option1 == 3)
					{
						user1.setBalance(atm1.deposit(user1.getBalance()));
						
						option1 = atm1.showMenu();
					}
					else if(option1 == 4)
					{						
						loopFlag = false;
					}
					else if(option1 < 1 || option1 > 4)
					{
						option1 = atm1.showMenu();
					}
				}
			}
			else
			{
				System.out.print("You have entered the wrong info.");
			}	
		}
		atm1.exit();		
	}
}
