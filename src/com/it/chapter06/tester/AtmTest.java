package com.it.chapter06.tester;

import com.it.chapter06.classes.Account;

public class AtmTest
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		
		Account acc1 = new Account();
		
		Account acc2 = new Account("NC-12345", 0.0);
		
		
		System.out.println(acc1.getName());
		
		System.out.println(acc2.getName());
		
		
	}
	
}
