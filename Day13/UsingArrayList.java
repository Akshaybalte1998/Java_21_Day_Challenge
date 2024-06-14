package com.printUptoEvenOdd;

import java.util.ArrayList;
import java.util.Scanner;


public class UsingArrayList {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to print the even and odd upto that number");
		int uptoNumber=scan.nextInt();
		ArrayList<Integer> evenNumber=new ArrayList<>();
		ArrayList<Integer> oddNumber=new ArrayList<>();
		for(int i=1;i<=uptoNumber;i++)
		{
			if(i%2==0)
			{
				evenNumber.add(i);
			
			}
			else
			{
				oddNumber.add(i);
 			}
			
			
			
		}
		System.out.println("even number  is : ");
		for(Integer k:evenNumber)
			System.out.print( k+ " " );
		
		System.out.println(" ");
		System.out.println("odd number  is : ");
		for(Integer j:oddNumber)
			System.out.print( j + " ");
	}

}
