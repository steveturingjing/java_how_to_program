package com.it.chapter11.base;

public abstract class BasePerson
{
	protected int number;
	protected String name;
	protected int age;
	protected boolean gender;
	
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean isGender()
	{
		return gender;
	}
	public void setGender(boolean gender)
	{
		this.gender = gender;
	}
	
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
	
	public static void run()
	{
		
	}
	
	public void introduce()
	{
		System.out.println("I an a father,,,My Name is: " + this.getName());
	}
	
	public abstract void speak();
}
