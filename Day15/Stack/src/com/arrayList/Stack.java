package com.arrayList;


public class Stack {
	
	int [] list;
	int size;
	int top;
	public Stack( int size) {
		super();
	
		this.size = size;
		this.top = -1;
		list=new int[size];
	}
	public boolean isEmpty() {
		
		return top==-1;
	}
	public boolean isFull()
	{
		
		return top==(size-1);
	}
	public  void push(int data) {
		if(isFull()) {
			System.out.println("stack is full ");
			return ;
			
		}
		list[++top]=data;
		
		
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1 ;
		}
		
		return list[top--];
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");

			return 0 ;
		}
		return list[top];
	}
	public int getSize()
	{
		return (top+1);
	}
	
	
	
	
	
	
}
