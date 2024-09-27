package day15;

import java.util.Scanner;

public class RecursionFunctionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int result=sum(n);
		System.out.println(result);
	}

	private static int sum(int n) 					
	{
		if(n==1)
			return 1;
		else
			return n+sum(n-1); 
	}

}
