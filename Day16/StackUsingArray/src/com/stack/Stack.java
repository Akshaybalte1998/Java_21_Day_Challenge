package com.stack;

public class Stack 
{
	
	private int [] arr;
	private int top;
	private int size;
	
	public Stack(int size)
	{
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	
//	.simple stack 
//	1. Insert
//	2. Delete
//	3. Display
//	4. Search
//	5.�Update
//	6.�Count
	

	public void insert(int data)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			return;
		}
		arr[++top]=data;
		System.out.println("insert elemet is : "+arr[top]);
	}
	
	public void delete()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return ;
		}
		int result=arr[top--];
		System.out.println("delete element id :"+result);
	}
	
	public void display()
	{
		System.out.print("elements are: ");
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	
	
	public void search(int data)
	{
		for(int i=0;i<=top;i++)
		{
			if(arr[i]==data)
			{
				System.out.println("gieven data is found at index :"+(i+1));
				break;
			}
		}
	}
	
	public void serachIndex(int index)
	{
		int result=arr[index];
		System.out.println(result);
	}
	
	
	
	public void updateIndex(int index,int data)
	{
		arr[index]=data;
	}
	public void updateValue(int oldValue,int newValue) 
	{
		for(int i=0;i<=top;i++)
		{
			if(arr[i]==oldValue)
			{
				arr[i]=newValue;
				break;
			}
		}

	}
	

	private boolean isEmpty() {
		return top==-1;
	}

	private boolean isFull() {
	return top==size-1;
	}
	
	public void reverse()
	{
		System.out.println("reverse order");
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+ "  ");
		}
		System.out.println(" ");
	}

	public void sort() {

		for (int i=0;i<=top;i++)
		{
			for(int j=i+1;j<=top;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
	
	}
}
