package com.it.chapter11.tester;

import com.it.chapter11.base.BasePerson;
import com.it.chapter11.classes.Student;
import com.it.chapter11.classes.Teacher;
import com.it.chapter11.impls.ImplTeacher;
import com.it.chapter11.interfaces.IPerson;

public class SchoolTest5
{
	
	public static void main(String[] args)
	{
		
		IPerson ip = new ImplTeacher();
		
		ip.introduce();
		
		
		
	}
	
}
