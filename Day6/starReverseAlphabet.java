package com.starReverse;

public class starReverseAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		char ch ='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				
			}
			System.out.println(" ");
			ch=(char)(ch+1);
	}

}
}
