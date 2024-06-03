package com.menuDrivenUtilityProgram;

import java.util.Scanner;

public class arrayUtilityClass {

	public static void AcceptArrayElement(int[] arr)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(" enter the "+i+" arrayelement");
	    	arr[i]=in.nextInt();
	    }
	}
	
	public  static void DisplayArrayElement(int[] arr)
	{
		System.out.print("array element are :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	public static  void SumArrayElement(int[] arr)
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array element is : "+sum);
	}
	

}
