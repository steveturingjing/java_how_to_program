package com.it.chapter08.tester;
import com.it.chapter08.classes.Time2;

public class Time2Test
{
	
	public static void main(String[] args)
	{
		// 1.
		Time2 time11 = new Time2();
		
		time11.setHour(1);
		time11.setMinute(35);
		time11.setSecond(58);
		
		// 2.
		Time2 time22 = new Time2();
		
		time22.setTimer(1, 35, 58);
		
		// 3.
		Time2 time33 = new Time2(1, 35, 58);
		
		// 4.
		Time2 time44 = new Time2(1, 35);
		time44.setTimer(1);
		
		
		
		
		
		
	}
	
}
