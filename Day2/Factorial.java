package factoiral;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int number = scan.nextInt();
		scan.close();
		int factorial =1;
		//finding factorial of number 
		//5!=5*4*3*2*1
		for(int i=1;i<=number;i++)
		{
			factorial*=i;
		}
		System.out.println("Factorial of  number " +number+ " is : " +factorial);
	}

}
