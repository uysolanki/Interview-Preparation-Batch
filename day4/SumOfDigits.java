package day4;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entera number");
		int n = sc.nextInt();   				//n	65382  =16					r			sum			
		int sum=0;							    //123 is 123>0 True			3			0			
		int r;									//12  is 12>0 True          2			3							3
		while(n>0)								//1   is 1>0 True			1			5
		{										//0	  is 0>0 False						6
			r=n%10;
			
			if(r%2!=0)
			System.out.println(r);
			//sum=sum+r;
			
			n=n/10;
		}
		
		//System.out.println(sum);

	}

}
