package com.natural;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number to print natural number: ");
		int uptoNumber=scan.nextInt();
		int sum=0;
		for( int i=1;i<=uptoNumber;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum : "+sum);
	}

}
