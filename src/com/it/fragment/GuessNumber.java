package com.it.fragment;

import java.util.Scanner;

public class GuessNumber
{
	public static void main(String[] args)
	{
		int n = 0;
		
		String enter = null;
		
		int x = (int)Math.random() * 1000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your guessing number: ");
		
		n = input.nextInt();
		
		boolean flag = true;
		
		while(flag)
		{
			if(n < 0 || n > 1000)
			{
				System.out.print("You have to enter the number between 0 and 1000.");
				
				System.out.print("Do you want to input the number again?(Y/N)");
				
				enter = input.nextLine();
				
				if(enter.toUpperCase().equals("N"))
				{
					flag = false;
					
					break;
				}
			}
			else
			{
				if(n < x)
				{
					System.out.print("Please enter the number between " + n + " and 1000: ");
					
					n = input.nextInt();
				}
				else if(n > x)
				{
					System.out.print("Please enter the number between 0 and " + n);
					
					n = input.nextInt();
				}
				else
				{
					System.out.println("You have entered the correct number. Do you want to play it again?(Y/N)");
					
					enter = input.nextLine();
					
					if(enter.toUpperCase().equals("N"))
					{
						flag = false;
						
						break;
					}
				}
			}
		}
		
		input.close();
	}
}