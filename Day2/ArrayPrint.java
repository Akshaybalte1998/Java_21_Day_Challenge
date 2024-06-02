package basicprogram;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int []arr;
		arr=new int [5];
	    //int []arr=new int[5]  
		//arr is reference for an array
	
	
	    int newarr[]=new int [arr.length];  //creating new array using old array
	
		//takingr input from user
	
	    for(int i=0;i<arr.length;i++)
		{
			System.out.print(" enter the "+i+" :");
			arr[i]=scan.nextInt();
		}
		
		
	    //printing output 
		
	    System.out.print("array element are : ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	
		
		System.out.println("  ");
	
		// create new array and saving information of old array in it
		
		for(int i=0 ;i<arr.length;i++)
		{
			 newarr[i]= arr[i];
		}
		
		//printing new array
		
		System.out.print("new array element are : ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print("  "+newarr[i]);
		}
		
		
		
		
		System.out.println("  ");
		
		// create new array and saving information of old array in it and adding 100 in each element
		
		for(int i=0 ;i<arr.length;i++)
		{
			 newarr[i]=  100 +arr[i];
		}
		
		//printing new array
		
		System.out.print("new array element are with addition 100 in it : ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print("  "+newarr[i]);
		}
		
		
		scan.close();
	}
/*
    enter the 1 :2
 enter the 2 :3
 enter the 3 :4
 enter the 4 :5
array element are :   1  2  3  4  5  
new array element are :   1  2  3  4  5  
new array element are :   101  102  103  104  105
 */
}
