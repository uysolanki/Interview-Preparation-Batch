package day10;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int len=sc.nextInt();    //len =10
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b); 
	
	for(int i=3;i<=len;i++)
	{
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
}
}
