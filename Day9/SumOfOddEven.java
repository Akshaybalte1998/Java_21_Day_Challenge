package com.oddEven;

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to print the even and odd upto that number");
		int uptoNumber=scan.nextInt();
		int evenSum=0;
		int oddSum=0;
		for(int i=1;i<=uptoNumber;i++)
		{
			if(i%2==0)
			evenSum+=i;
			
			
		}
		System.out.println(" sum of even number is :  "+evenSum);

		for(int i=1;i<=uptoNumber;i++)
		{
			if(i%2!=0)
			oddSum+=i;

		}
		System.out.print(" sum of odd number is : "+oddSum);

			}

}
