package day3;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Percentage");
		double percentage = sc.nextDouble();
		
		
		if(percentage>=70)
		{
			System.out.println("DIST");
		}
		
		else if(percentage>=60)
		{
			System.out.println("FC");
		}
		else if(percentage>=50)
		{
			System.out.println("SC");
		}
		else if(percentage>=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Not Class");
		}
	}

}
