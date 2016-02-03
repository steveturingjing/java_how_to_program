package com.it.chapter11.tester;

import java.util.Scanner;

import com.it.chapter11.base.BasePerson;
import com.it.chapter11.classes.Student;
import com.it.chapter11.classes.Teacher;

public class SchoolTest2
{
	
	public static void main(String[] args)
	{
		
//		BasePerson person = new Teacher(1, "Steve", 33, true, 10);
		
		//BasePerson person = new Student(10, "Michael", 18, true, 2);
		
//		BasePerson person = new BasePerson();
		
		BasePerson.run();
		Teacher.run();
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入调用着身份，1=老师；2=学生。");
		
		int flag = scanner.nextInt();
		
		BasePerson person = null;
		
		if(flag == 1)
		{
			person = new Teacher(1, "Steve", 33, true, 10);
			
		}
		else if(flag == 2)
		{
			person = new Student(10, "Michael", 18, true, 2);
			
		}
		
		person.introduce();
		
		
		
		
		scanner.close();
		
		
	}
	
}
