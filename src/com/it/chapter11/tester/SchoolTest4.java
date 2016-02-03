package com.it.chapter11.tester;

import com.it.chapter11.base.BasePerson;
import com.it.chapter11.classes.Student;
import com.it.chapter11.classes.Teacher;

public class SchoolTest4
{
	
	public static void main(String[] args)
	{
		
		BasePerson person = new Teacher();
		
		Teacher tea = null;
		
		
		tea = (Teacher)person;
		
		System.out.println(tea);
		
		
		
		BasePerson per = null;
		
		
		Teacher teacher = new Teacher();
		
		per = teacher;
		
		System.out.println("per: " + per);
		
		
		
//		Student student = null;
//		
//		student = (Student)person;
//		
//		System.out.println(student);
		
		BasePerson p = null;
		
		Student s = (Student)p;
		
		System.out.println(s);
		
		
	}
	
}
