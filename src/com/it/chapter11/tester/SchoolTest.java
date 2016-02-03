package com.it.chapter11.tester;

import com.it.chapter10.classes.Student;
import com.it.chapter10.classes.Teacher;

public class SchoolTest
{
	
	public static void main(String[] args)
	{
		Teacher tea1 = new Teacher(1, "Steve", 33, true, 10);
		
		
		Student stu1 = new Student(10, "Michael", 18, true, 2);
		
		
		tea1.introduce();
		tea1.teach();
		
		
		stu1.introduce();
		stu1.study();
		
		System.out.println(tea1.toString());
		
		
		
		
	}
	
}
