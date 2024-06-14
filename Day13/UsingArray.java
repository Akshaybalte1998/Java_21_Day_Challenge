package com.printUptoEvenOdd;

import java.util.Scanner;

public class UsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to print the even and odd upto that number");
		int uptoNumber=scan.nextInt();
		
		int[] evenNumber=new int[uptoNumber/2+1];
		int[] oddNumber=new int[uptoNumber/2];
		int indexEven=0;
		int indexOdd=0;
		for(int i=1;i<=uptoNumber;i++)
		{
			if(i%2==0)
			{
				evenNumber[indexEven]=i;
				indexEven++;
			}
			else
			{
				oddNumber[indexOdd]=i;
				indexOdd++;
			}
			
			
			
		}
		System.out.println("even number  is : ");

		for(int i=0;i<indexEven;i++)
		{
			System.out.print(evenNumber[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("odd number  is : ");

		for(int i=0;i<indexOdd;i++)
		{
			System.out.print(oddNumber[i]);
			System.out.print(" ");
		}
			
		
		
		
	}

}
