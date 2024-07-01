package com.circularQueue;

public class Queue 
{

	int [] array;
	int size;
	int rear;
	int front;
	
	public Queue(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		array=new int[size];
		
	}
	
	public boolean isEmpty()
	{
		return front==-1&&rear==-1;
	}
	
	public boolean isFull()
	{		
		return  front==(rear+1)%size;

	}

	public void add(int data) {
		// TODO Auto-generated method stub
		if(isFull())
		{
			System.out.println("queue is full");
			return ;
		}
		if(front==-1)
		{
			front=0;
		}
		rear=(rear+1)%size;
		array[rear]=data;
	}
	public int delete()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return 0;
		}
		int result=array[front];
		if(front==rear)
		{
			front=rear=-1;
		}
		else
		{
			front=(front+1)%size;
		}
		
		
		return result;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return 0;
		}
		
		
		
		
		return array[front];
	}
	public int getSize()
	{
		if(isEmpty())
		{
			return 0;
		}
		if(rear>=front)
		{
			return rear-front+1;
		}
		return  size-front+rear+1;
	}
	
	
	
	
	
}
