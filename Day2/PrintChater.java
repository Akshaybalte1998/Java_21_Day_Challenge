package com.character;

import java.util.Scanner;

public class PrintChater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the charater");
		char ch =scan.next().charAt(0);
		System.out.println("output :" +ch);
	
		//ascii value
		int asciiValue=ch;
		System.out.println("ascii  value of given charater: "+ asciiValue);
	
	
	
	
	}

}
