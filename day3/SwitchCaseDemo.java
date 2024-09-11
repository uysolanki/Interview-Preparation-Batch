package day3;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. English");
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Call Routed to London "); break;
		case 2: System.out.println("Call Routed to Delhi "); break;
		case 3: System.out.println("Call Routed to Pune "); break;
		default : System.out.println("Invalid Input ");
		}

	}

}
