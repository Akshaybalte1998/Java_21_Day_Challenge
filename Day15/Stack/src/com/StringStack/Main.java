package com.StringStack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack list=new Stack(10);
		list.push("akshay");
		list.push("amit");
		list.push("ajay");
		list.push("ashu");
		list.push("shre");
		list.push("pan");
		
		
		System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list.peek());
		
		System.out.println(list.getSize());
		while(!list.isEmpty())
		{
			System.out.println("name: "+list.pop());
		}

	}

}
