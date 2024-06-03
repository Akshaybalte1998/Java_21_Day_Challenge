package com.natural;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number to print natural number: ");
		int uptoNumber=scan.nextInt();
		for( int i=1;i<=uptoNumber;i++)
		{
			System.out.print(i +" ");
		}
	}

}
