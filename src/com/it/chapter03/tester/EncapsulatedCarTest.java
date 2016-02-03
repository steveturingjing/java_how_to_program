package com.it.chapter03.tester;

import com.it.chapter03.classes.EncapsulatedCar;

public class EncapsulatedCarTest
{
	
	public static void main(String[] args)
	{
		EncapsulatedCar.printInfo();
		
		
		EncapsulatedCar bmw = new EncapsulatedCar();
		
		bmw.setSize(-2222.2222);
		
		System.out.println("The new bmw's size is " + bmw.getSize());
		
		
		EncapsulatedCar benz = new EncapsulatedCar();
		benz.setDefaultValues(350.99, "red");
		
		// the example of static method in Java-API
		int num = Math.abs(-3);
		System.out.println("Its absolute value is " + num);
		
		//TODO 构建构造器, 完善测试用例.
		
		
		
		
		
		
		
		
		
	}
	
}
