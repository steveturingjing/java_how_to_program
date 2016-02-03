package com.it.chapter02.tester;

import java.util.Scanner;

public class Comparison
{
	
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter second integer: ");
		num2 = sc.nextInt();
		
		sc.close();
		
		
		if(num1 == num2)
		{
			System.out.println(num1 + " == " + num2);
		}
		if(num1 != num2)
		{
			System.out.println(num1 + " != " + num2);
		}
		
		if(num1 <= num2)
		{
			System.out.println(num1 + " <= " + num2);
		}
		if(num1 >= num2)
		{
			System.out.println(num1 + " >= " + num2);
		}
		
		if(num1 < num2)
		{
			System.out.println(num1 + " < " + num2);
		}
		if(num1 > num2)
		{
			System.out.println(num1 + " > " + num2);
		}
		
	}
	
}
