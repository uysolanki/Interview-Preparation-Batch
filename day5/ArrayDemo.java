package day5;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
//		int arr[]= {10,20,30,40,50};
//		
//		int sum=0;
//		
//		for(int i=0;i<arr.length;i++)				//i			arr[i]		sum
//		{											//0				10		0
//			sum=sum+arr[i];							//1				20		10
//		}											//2				30		30
//		System.out.println(sum);    				//3				40		60		
													//4				50		100
													//5						150
	
//		for(int n:arr)
//		{
//			sum+=n;
//		}
//		System.out.println(sum);
		
		int brr[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
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
