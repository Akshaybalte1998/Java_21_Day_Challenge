package com.starReverse;

public class starReverseAlphabetIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		char ch ='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch=(char)(ch+1);
				
			}
			System.out.println(" ");
			
	}
	}

}
