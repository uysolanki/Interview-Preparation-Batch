/*
 Accept a number from user , if number is odd display its square, else display its cube 
 */


package day3;

import java.util.Scanner;

public class SquareCubeExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt(); //3  out 9
		                    //4  output 64 
		System.out.println(oddeven(n)?square(n):cube(n));
		

	}

	public static boolean oddeven(int n)
	{
		if(n%2==1)
			return true;
		else
			return false;
	}
	private static int cube(int n) {
		return n*n*n;
	}

	private static int square(int n) { 
		return n*n;
	}

}
