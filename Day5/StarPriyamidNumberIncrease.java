package com.star;

public class StarPriyamidNumberIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ a+" " );
				a++;
			}
			System.out.println(" ");
		}
	}

}
/*

 1  
 2  3  
 4  5  6  
 7  8  9  10  
 11  12  13  14  15  
 16  17  18  19  20  21 
*/