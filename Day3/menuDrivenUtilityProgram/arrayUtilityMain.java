package com.menuDrivenUtilityProgram;

import java.util.Scanner;

import com.arrayUtility.arrayUtilityClass;

public class arrayUtilityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
	
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		int choice;
	    while(true) {
		
			System.out.println("menu deivern");
			
			System.out.println("1. accept array elemenrt from user");
			System.out.println("2. display array element");
			System.out.println("3.sum of array element");
			System.out.println("enter other value for exist the loop");
			System.out.println("Enter a choice");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				arrayUtilityClass.AcceptArrayElement(arr);
				break;
			case 2:
				arrayUtilityClass.DisplayArrayElement(arr);
				break;
			case 3:
				arrayUtilityClass.SumArrayElement(arr);
				break;
			default:
				return;
				
			}
		
		
		
		
		
		}
	}

}




/*	do {
		
			System.out.println("menu deivern");
			
			System.out.println("1. accept array elemenrt from user");
			System.out.println("2. display array element");
			System.out.println("3.sum of array element");
			System.out.println("0 fro exist the loop");
			System.out.println("Enter a choice");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				arrayUtilityClass.AcceptArrayElement(arr);
				break;
			case 2:
				arrayUtilityClass.DisplayArrayElement(arr);
				break;
			case 3:
				arrayUtilityClass.SumArrayElement(arr);
				break;
			default:
			System.out.println("enter valid choice");
				
			}
		
		
		
		
		
		}while(choice!=0);
*/
