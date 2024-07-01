package com.LinearQueue;

import java.util.Scanner;

public class UsingArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;
        Queue q=new Queue();
        do {
            System.out.println("Queue Operations Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Update");
            System.out.println("6. Count");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    q.insert(element);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int searchElement = scanner.nextInt();
                    q.search(searchElement);
                    break;
                case 5:
                    System.out.print("Enter index to update: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    q.update(index, newValue);
                    break;
                case 6:
                    q.count();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
        } while (choice != 7);
	}

}
