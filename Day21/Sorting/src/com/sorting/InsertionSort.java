package com.sorting;

public class InsertionSort {

	private static void insertionSort(int[] array) {

		
		
	}
	
	
	
	
	private static void printArray(int[] array) {

	System.out.print("printing array : ");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i] +" ");
	}
	System.out.println(" ");
	}
	public static void main(String[] args) {

		
		int [] array= {184,5941,8748,88775,5,84,95};
		printArray(array);
		insertionSort(array);
		printArray(array);

	}
	

	

}
