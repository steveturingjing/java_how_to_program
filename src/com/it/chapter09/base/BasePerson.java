package com.it.chapter09.base;

public class BasePerson
{
	protected int number;
	protected String name;
	protected int age;
	protected boolean gender;
	
	public BasePerson()
	{
		
	}
	public BasePerson(int number, String name, int age, boolean gender)
	{
		this.number = number;
		this.name   = name;
		this.age    = age;
		this.gender = gender;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setGender(boolean gender)
	{
		this.gender = gender;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public boolean getGender()
	{
		return this.gender;
	}
	
	
	public void introduce()
	{
		System.out.println("My Name is: " + this.getName());
	}
}
