package com.star;

public class StarAlphabetIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet='A';
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+alphabet +" " );
				alphabet = (char) (alphabet +1);
			}
			System.out.println(" ");
			
		}
	}

}
/*
 A  
 B  C  
 D  E  F  
 G  H  I  J  
 K  L  M  N  O  
 P  Q  R  S  T  U 
 
 */
