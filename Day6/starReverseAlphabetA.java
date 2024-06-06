package com.starReverse;

public class starReverseAlphabetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
	
		for(int i=n;i>=1;i--)
		{char ch ='A';
			for(int j=1;j<=i;j++)
			{	
				System.out.print(ch+" ");
				ch=(char)(ch+1);
				
			}
			System.out.println(" ");
		}
	}

}
