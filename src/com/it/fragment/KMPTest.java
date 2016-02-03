package com.it.fragment;

import java.util.ArrayList;

/**
 * Knuth-Morris-Pratt (KMP子字符串查找算法)
 * @author Michael Song
 */
public class KMPTest
{
	// 主串
	public String mainString;
	// 子串
	public String subString;
	public static int next[] = new int[20];
	
	public KMPTest(String mainString, String subString)
	{
		this.mainString = mainString;
		this.subString  = subString;
	}
	
	public void setNext()
	{
		int lenCh = this.subString.length();
		
		next[0] = 0;
		next[1] = 1;
		
		// k表示next[i-1]的值
		int k = 0;
		for(int i = 2; i <= lenCh; i++)
		{
			k = next[k];
			
			// 这个while循环的作用找个例子看看就好理解了 我认为是每次找最长，一旦成功就停止，保证找到的是当前最长
			while(k != 0 && this.subString.charAt(i - 1) != this.subString.charAt(k))
			{
				k = next[k];
			}
			
			if(this.subString.charAt(i - 1) == this.subString.charAt(k))
			{
				k++;
			}
			// else就是k=0
			// 不是next[k] = k，i表示有几个字符的前缀
			next[i] = k;
		}
	}
	
	public ArrayList<Integer> getKmp()
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int lenStr = this.mainString.length();
		int lenCh = this.subString.length();
		
		// 主串开始的匹配位置
		int pos = 0;
		// 模式串每次匹配位置
		int k = 0;
		// 循环条件不是k<lenCh,这样的话可能死循环(没有匹配发生)
		while(pos < lenStr)
		{
			// 首次进入没什么大作用，做要是为提高以后的匹配效率 写在最后一行也行
			k = next[k];
			while(k < lenCh && this.mainString.charAt(pos) == this.subString.charAt(k))
			{
				pos++;
				k++;
			}
			
			if(lenCh == k)
			{
				arr.add(pos - k);
			}
			else if(0 == k)
			{
				/*
				 * 不加这一句死循环 因为next[0] = 0 比如abcd和abce，到de不匹配，此时执行k =
				 * next[k](k=3), k变为0，发现d和a不匹配，此时k还是0，重复执行以上步骤，那么死循环了
				 */
				pos++;
			}
			// 实际上else就是k = next[k]，所以才说k = next[k]写在最后一行也行
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		KMPTest kmp = new KMPTest("1kk23789456789hahha", "789");
		kmp.setNext();
		
		ArrayList<Integer> arr = kmp.getKmp();
		
		if(arr.size() != 0)
		{
			for(int i = 0; i < arr.size(); i++)
			{
				System.out.println("匹配发生在:" + arr.get(i));
			}
		}
		else
		{
			System.out.println("匹配不成功");
		}
	}
	
}