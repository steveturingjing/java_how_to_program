package com.it.chapter07.classes;

public class Bounds
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] responses = {1, 2, 13, 4};
		
		int[] frequency = {10, 20, 30, 40, 50, 60};
		
		int result = 0;
		
		try
		{
			for(int i = 1; i < responses.length; i++)
			{
				int number = frequency[responses[i]] / i;
				
				result += number;
				
				System.out.println(number);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally: " + result);
		}
		
		System.out.println("It is over ...");
		
	}
	
}
