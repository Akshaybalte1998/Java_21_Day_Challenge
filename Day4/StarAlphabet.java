package com.star;

public class StarAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet='A';
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+alphabet +" " );
				
			}
			System.out.println(" ");
			alphabet = (char) (alphabet +1);
		}
	}

}
/*
 A  
 B  B  
 C  C  C  
 D  D  D  D  
 E  E  E  E  E  
 F  F  F  F  F  F  

*/