package com.it.chapter07.tester;

public class PassBy
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//		int realNum = 1;
//		
//		passInt(realNum);
//		
//		System.out.println("Result is: " + realNum); // ?2 ?3
		
		
//		int[] realArr = new int[2];//{1, 2};
//		int[] realArr = {1, 2};
		
//		int[] realArr = new int[]{1, 2};
//		passArray(realArr);
//		
//		System.out.println("Result is: " + realArr[0] + " and " + realArr[1]);
		
		
//		String realStr = new String("xxxxxx......");
		String realStr = "xxxxxx......";
		passString(realStr);
		
		System.out.println("Result is: " + realStr);
		
	}
	
	
	public static void passInt(int num)
	{
		num = 9;
		System.out.println("In Method: " + num);
	}
	
	public static void passArray(int[] arrs)
	{
		arrs[0] = 9;
		System.out.println("In Method: " + arrs[0]);
	}
	
	public static void passString(String str)
	{
		str = "hehe";
		System.out.println("In Method: " + str);
	}
	
	
	
	
	
	
	
}
