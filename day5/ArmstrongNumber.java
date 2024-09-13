package day5;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		int bu=n;
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}

		if(bu==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is NOT Armstrong");
		}
	}

}
