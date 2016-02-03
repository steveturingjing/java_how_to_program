package com.it.chapter03.classes;

public class EncapsulatedCar
{
	private double size;
	private String color;
	
	public void setSize(double sz)
	{
		if(sz <= 200)
		{
			this.size = 200;
		}
		this.size = sz;
		
//		this.size = (sz <= 200) ? 200 : sz; // equivalent to the above code
	}
	public double getSize()
	{
		return this.size;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public EncapsulatedCar()
	{
		/*
		 * 此处的无参构造函数为空实现，表面上看并无必要。
		 * 但若无特殊原因，
		 * *****请  手  动  添  加  默  认  的  无  参  构  造  器  ！*****
		 * 以避免因“编译器不提供默认无参构造器”导致在“外部实现类中”无法默认初始化对象，造成莫名错误。
		 */
	}
	
	public EncapsulatedCar(double sz, String cr)
	{
		this.setSize(sz);
		this.color = cr;
		
		/*
		 * 表面上看下述的方法调用与上述代码行为表现一致，且语法上并无错误。
		 * *****但  请  不  要  在  构  造  器  内  调  用  任  何  方  法  ！*****
		 * 可能因子类将方法重写后导致原父类构造器中调用的方法被覆盖造成不可预知的结果。
		 * 详情请查看"第十章.面向对象编程：多态与接口"。
		 */
//		this.setDefaultValues(sz, cr); 
	}
	
	
	
	public void setDefaultValues(double sz, String cr)
	{
		this.setSize(sz);
		this.color = cr;
	}
	
	/**
	 * static method
	 */
	public static void printInfo()
	{
		System.out.println("程序开始运行啦。。打印...");
		System.out.println("车辆信息开始打印...");
	}
	
}
