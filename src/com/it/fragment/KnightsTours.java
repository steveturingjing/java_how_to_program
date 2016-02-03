package com.it.fragment;

public class KnightsTours
{
	public static final int[] arri = {+1, +2, +2, +1, -1, -2, -2, -1};
	public static final int[] arrj = {-2, -1, +1, +2, +2, +1, -1, -2};
	
	public static boolean arrfull(int[][] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = 1; j < arr[i].length; j++)
			{
				if(arr[i][j] == 0)
				{
					return false;
				}
			}
		}

		return true;
	}
    public static boolean inarr(int x, int y, int[][] arr) { 
        return (((x>=0) && (x<arr.length)) && ((y>=0)&&(y<arr[0].length)));     } 
    public static int findsuccessor(int i, int j, int[][] arr){         int m, n, count = 0;for (int k=0;k<arri.length;k++){ 
            m = i+arri[k];             n = j+arrj[k]; 
            if (inarr(m,n,arr)){                 if (arr[m][n]==0){                     count++;                      }             }         }  
        return count;     } 
    public static void Warnsdorff(int m, int n, int[][] arr){         int i, j, step = 2, count = 8, subcount, iok = 0, jok = 0;         boolean find = false;              
        i = m;         j = n;          
        arr[0][0] = 1;       
        while (!arrfull(arr)){             find = false;             count = 8; 
            for (int k=0;k<arri.length;k++){ 
                if (!inarr(i+arri[k], j+arrj[k], arr)) continue;                 if (arr[i+arri[k]][j+arrj[k]]!=0) continue; 
                subcount = findsuccessor(i+arri[k], j+arrj[k], arr);                 if (count > subcount){                     count = subcount;                     iok = i+arri[k];                     jok = j+arrj[k];                     find = true;                 }             } 
            if (!find) break; 
            arr[iok][jok] = step;             i = iok;             j = jok;             step++;         }     }    
    public static void main(String[] args){         int[][] panel = new int[8][8];         int i, j, none=0;Warnsdorff(0, 0, panel); 
        for(i=0; i<panel.length; i++){ 
            for (j=0; j<panel[i].length; j++){                 if (panel[i][j]==0) none++; 
                System.out.print((panel[i][j]>=10)?(panel[i][j]+"   "):(panel[i][j]+"    "));                } 
            System.out.println("");         }    
        System.out.println(""); 
        System.out.print("未跳到的格数："+none);     }    }