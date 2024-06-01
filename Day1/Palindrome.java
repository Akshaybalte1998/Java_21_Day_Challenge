package factoiral;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number: ");
		int number =scan.nextInt();
		scan.close();
		int temp = number;
		int reverse=0;
		while(number>0)
		{
			int temp1=number%10;
			reverse = (reverse*10)+temp1;
			number =number/10;
		}
		
		if(temp==reverse)
		{
			System.out.println("NUmber "+temp+" is palidrome number");
			
		}
		else
		{
			System.out.println("NUmber "+temp+" is not  palidrome number");
		}
	}

}
