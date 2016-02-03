package com.it.chapter11.classes;

import com.it.chapter11.base.BasePerson;

public class Student extends BasePerson
{
	private int gradeYear;
	
	public Student()
	{
		
	}
	public Student(int number, String name, int age, boolean gender, int gradeYear)
	{
		super(number, name, age, gender);
		this.gradeYear = gradeYear;
	}
	
	public void setGradeYear(int gradeYear)
	{
		this.gradeYear = gradeYear;
	}
	public int getGradeYear()
	{
		return this.gradeYear;
	}
	
	public void study()
	{
		System.out.println("I am studying...");
	}
	
	
	
	public void speak()
	{
		System.out.println();
	}
}
