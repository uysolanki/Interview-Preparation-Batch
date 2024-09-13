package day5;

import java.util.Scanner;

public class ArrayOfUserDefinedLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int size=sc.nextInt();
		
		int brr[]=new int[size];
		int i;
		for(i=0;i<brr.length;i++)
		{
			System.out.println("enter a number");   //10
			brr[i]=sc.nextInt();
		}
		int sum=0;
		for(int n:brr)
			{
				sum+=n;
			}
			System.out.println(sum);

	}

}
