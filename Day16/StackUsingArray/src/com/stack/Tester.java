package com.stack;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack sarr=new Stack(20);
		sarr.insert(110);		sarr.insert(20);

		sarr.insert(3);

		sarr.insert(400);
		sarr.insert(50);
		sarr.insert(160);
		sarr.insert(7);
		//		sarr.delete();
//		sarr.delete();
//		sarr.delete();
		sarr.display();
		
		
		sarr.search(30);
		sarr.serachIndex(2);
		
		sarr.updateIndex(2, 22);
		sarr.updateValue(50, 55);
		sarr.display();
		
		System.out.println("before sort");
		sarr.display();
		System.out.println("After sort");
		sarr.sort();
		sarr.display();

		System.out.println("reverse order");
		sarr.reverse();
		
		
		
	}
	

}
