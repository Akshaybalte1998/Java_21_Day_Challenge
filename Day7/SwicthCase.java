package switchCase;

import java.util.Scanner;

public class SwicthCase {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int choice;
		
		while(!false) 
		{
			System.out.println(" 1. addition\n2. substraction\n3.multiplication\n4.division\n5.exist");
			System.out.println("enter a number ");
			 choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("we performing addition");
				break;
			case 2:
				System.out.println("we performing substraction ");
				break;
				
			case 3:
				System.out.println("we perform multiplication");
				break;
			case 4:
				System.out.println(" we perform division");
			break;

			case 5:
				System.out.println(" exist ");
				return;
			
			default :
				System.out.println("you enter the wrong input please enter new input");
				break;
				
			}
			
			
		}
	}

}
