package com.it.fragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Anagrams
 * @author Michael Song
 */
public class Anagrams
{
	/*
		Given an array of strings, return all groups of strings that are anagrams.
		Note: All inputs will be in lower-case.
		For example:
		Input:  ["tea","and","ate","eat","den"]
		Output: ["tea","ate","eat"]
		
		Anagram（回文构词法）是指由颠倒字母顺序组成的单词，比如“dormitory”颠倒字母顺序会变成“dirty room”，“tea”会变成“eat”。回文构词法有一个特点：单词里的字母的种类和数目没有改变，只是改变了字母的排列顺序。
		思路：用map<string, int>记录排序后的字符串以及首次出现的位置。
		1. 从strs的第一个元素开始遍历，首先对string进行排序得到tmps；
		2. 在map里查找tmps；
		3. 若不存在，将tmps以及该元素的下标存入map<string ,int>；
		4. 若存在，首先将第一次出现tmps时的原始字符串存入结果solution，即strs[map[tmps]]，并将map[tmps]设置为-1（防止下次再存），再将该字符串本身存入结果solution；
		5. 重复以上1-4步，直到遍历结束。
	 */
	public static ArrayList<String> anagrams(String[] strs)
	{
		ArrayList<String> list       = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int length = strs.length;
		
		for(int i = 0; i < length; i++)
		{
			char[] chars = strs[i].toCharArray();
			
			Arrays.sort(chars);
			
			String anagram = new String(chars);
			
			if(map.containsKey(anagram))
			{
				int index = map.get(anagram);
				
				if(index != -1)
				{
					list.add(strs[index]);
					map.put(anagram, -1); // 用-1标识第一次出现的重排列字符串
				}
				
				list.add(strs[i]);
			}
			else
			{
				map.put(anagram, i);
			}
			
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		// Step 1: 先将原字符串(比如书信中的内容一大段话等)全部转换成小写或大写(toUpperCase()/toLowerCase())，然后根据某种过滤条件(比如标点符号或空格等)分割成字符串数组或其他字符串容器。此处例子用的是字符串数组
		String[] contents = {"doodled", "oodledd", "oodddle", "dizzy", "daisy", "systoo", "tysoso"};
		
		ArrayList<String> list = Anagrams.anagrams(contents);
		
		for(String str : list)
		{
			System.out.println(str);
		}
		
	}
	
}
