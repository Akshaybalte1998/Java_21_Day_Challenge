package com.odd;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number to print odd number upto given number ");
		int number=scan.nextInt();
		int sum=0;

		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
				sum+=i;
			

		}
		System.out.println("sum of odd number: "+sum);
	}

}
