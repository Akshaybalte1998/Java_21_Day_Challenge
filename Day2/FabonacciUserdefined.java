package basicprogram;

import java.util.Scanner;

public class FabonacciUserdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the two number");
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		scan.close();
		
		System.out.print(" Fabonnic series : "+number1+" "+number2+ " ");
		int number3, count =10;
		// addition of previous two number in next number
		for(int i =3;i<=count;i++)
		{
			number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
			
		}
		// Fabonnic series : 0 1  1 2 3 5 8 13 21 34
		
	}

}
