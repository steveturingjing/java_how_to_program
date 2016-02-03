package com.it.chapter03.tester;

import com.it.chapter03.classes.BasicCar;

public class BasicCarTest
{
	
	public static void main(String[] args)
	{
		BasicCar bmw = new BasicCar();
		
		bmw.color = "red";
		bmw.size  = 367.89;
		
		bmw.setDefaultValues(135.79, "blue");
		
		System.out.print("The new car's color is " + bmw.color);
		
		System.out.println(" and the size is " + bmw.size);
		
	}
	
}
