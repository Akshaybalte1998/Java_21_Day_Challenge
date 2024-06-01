package basicprogram;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter the two number ");
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		scan.close();
		
		int max =number1;
		if(max<number2)
		{
			max=number2;
		}
		for(int i = max; i>0;i--)
		{
			if(number1%i==0 &&number2%i==0)
			{
				System.out.println("GCD og given "+number1+" and "+number2+" is : "+i);
				break;
			}
		}

	}

}
