package com.LinearQueue;

public class Queue {
	 static final int MAX = 1000;
	    static int queue[] = new int[MAX];
	    static int front = 0, rear = -1;
	
	static void insert(int element) {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow!");
        } else {
            queue[++rear] = element;
            System.out.println("Inserted " + element + " into the queue.");
        }
    }

    // Method to delete element from the queue
    static void delete() {
        if (front > rear) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println("Deleted " + queue[front++] + " from the queue.");
        }
    }

    // Method to display elements of the queue
    static void display() {
        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Method to search for an element in the queue
    static void search(int element) {
        for (int i = front; i <= rear; i++) {
            if (queue[i] == element) {
                System.out.println(element + " found at index " + i + " in the queue.");
                return;
            }
        }
        System.out.println(element + " not found in the queue.");
    }

    // Method to update an element in the queue
    static void update(int index, int newValue) {
        if (index < front || index > rear) {
            System.out.println("Index out of bounds.");
        } else {
            queue[index] = newValue;
            System.out.println("Updated element at index " + index + " to " + newValue);
        }
    }

    // Method to count number of elements in the queue
    static void count() {
        int count = rear - front + 1;
        System.out.println("Number of elements in the queue: " + count);
    }


}
	


