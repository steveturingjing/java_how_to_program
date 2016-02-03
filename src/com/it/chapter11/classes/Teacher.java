package com.it.chapter11.classes;

import com.it.chapter11.base.BasePerson;

public class Teacher extends BasePerson
{
	private int workYear;
	
	public Teacher()
	{
		
	}
	public Teacher(int number, String name, int age, boolean gender, int workYear)
	{
		super(number, name, age, gender);
		this.workYear = workYear;
	}
	
	public void setWorkYear(int workYear)
	{
		this.workYear = workYear;
	}
	public int getWorkYear()
	{
		return this.workYear;
	}
	
	public void teach()
	{
		System.out.println("I am teaching...");
	}
	
	public void introduce()
	{
		System.out.println("My Name is: " + this.getName());
	}
	public void introduce(String name)
	{
		System.out.println("My Name is: " + this.getName() + " And Your name is " + name);
	}
	
	public void speak()
	{
		
	}

}
