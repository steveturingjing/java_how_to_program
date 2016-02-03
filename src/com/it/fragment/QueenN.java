package com.it.fragment;

public class QueenN
{
	public static int num             = 0;                  // 累计方案总数.
	public static final int MAX_QUEEN = 8;                  // 皇后个数, 同时也是棋盘行列总数, QueenN 中的 N = 8.
	public static int[] cols          = new int[MAX_QUEEN]; // 定义 cols 数组, 表示 8 列棋子摆放情况.
	
	public void getArrangement(int n)
	{
		// 遍历该列所有不合法的行, 并用 rows 数组记录, 不合法即 rows[i] = true;
		boolean[] rows = new boolean[MAX_QUEEN];
		
		for(int i = 0; i < n; i++)
		{
			rows[cols[i]] = true;
			int d = n - i;
			
			if(cols[i] - d >= 0)
			{
				rows[cols[i] - d] = true;
			}
			if(cols[i] + d <= MAX_QUEEN - 1)
			{
				rows[cols[i] + d] = true;
			}
		}
		
		for(int i = 0; i < MAX_QUEEN; i++)
		{
			// 判断该行是否合法
			if(rows[i]) continue;
			
			// 设置当前列合法棋子所在行数
			cols[n] = i;
			
			// 当前列不为最后一列时
			if(n < MAX_QUEEN - 1)
			{
				getArrangement(n + 1);
			}
			else
			{
				// 累计方案个数
				num++;
				
				// 打印棋盘信息
				printChessBoard();
			}
		}
	}
	
	public void printChessBoard()
	{
		System.out.println("第 " + num + " 种走法: ");
		
		for(int i = 0; i < MAX_QUEEN; i++)
		{
			for(int j = 0; j < MAX_QUEEN; j++)
			{
				if(i == cols[j])
				{
					System.out.print("0 ");
				}
				else
					System.out.print("+ ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		QueenN queen = new QueenN();
		
		queen.getArrangement(0);  
		System.out.println();  
		System.out.println(MAX_QUEEN + "皇后问题共有 " + num + " 种解决方案。"); 
		
	}
}
