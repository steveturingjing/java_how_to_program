package com.it.chapter08.classes;

public class Time2
{
	private int hour;
	private int minute;
	private int second;
	
	public Time2()
	{
		
	}
	
	public Time2(int h, int m, int s)
	{
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
	}
	
	public Time2(int h, int m)
	{
		this.setHour(h);
		this.setMinute(m);
	}
	
	public void setHour(int h)
	{
		this.hour = (h < 0 || h > 24) ? h : 0;
	}
	public void setMinute(int m)
	{
		this.minute = m;
	}
	public void setSecond(int s)
	{
		this.second = s;
	}
	
	public int getHour()
	{
		return this.hour;
	}
	public int getMinute()
	{
		return this.minute;
	}
	public int getSecond()
	{
		return this.second;
	}
	
	public void setTimer(int h, int m, int s)
	{
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
	}
	
	public void setTimer(int h, int m)
	{
		this.setHour(h);
		this.setMinute(m);
	}
	
	public void setTimer(int h)
	{
		this.setHour(h);
	}
}
