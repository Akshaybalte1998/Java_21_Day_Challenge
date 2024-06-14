package com.printUptoEvenOdd;

import java.util.Scanner;

public class PrintUptoEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to print the even and odd upto that number");
		int uptoNumber=scan.nextInt();
		System.out.println("even  number is : ");
		for(int i=1;i<=uptoNumber;i++)
		{
			if(i%2==0)
				System.out.print( i  );
			System.out.print(" ");
			
			
		}
		System.out.println(" ");
		System.out.println("odd   number is : ");

		for(int i=1;i<=uptoNumber;i++)
		{
			if(i%2!=0)
				System.out.print( i  );
			
			System.out.print(" ");

		}
		
	}

}
