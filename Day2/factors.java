package factoiral;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int number =scan.nextInt();
		scan.close();
		System.out.print("Factores of given number"+number+" is :" );
		//printing factors of given number
		for(int i =1 ;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(" "+i+", ");
			}
		}
		
		

	}

}
