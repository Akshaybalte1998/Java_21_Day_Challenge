package com.oddEven;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number for checkingg odd or even ");
		int number=scan.nextInt();
		if(number%2==0)
		{
			System.out.println(number +"   number is even number: ");
		}
		else
			System.out.println(number+"  number is odd number: ");

		
		
		
		
	}

}
