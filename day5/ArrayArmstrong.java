package day5;

import java.util.Scanner;

public class ArrayArmstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int brr[]=new int[5];
		int i;
		for(i=0;i<brr.length;i++)
		{											//0		1	2	3	4
			System.out.println("enter a 3 digit number");   //123	153	120	370	455
			brr[i]=sc.nextInt();
		}
		int sum,n,r;
		for(i=0;i<brr.length;i++)
		{
			sum=0;
			n=brr[i];
			
			while(n>0)
			{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			}
			
			if(sum==brr[i])
			{
				System.out.println(brr[i] + "is Armstrong");
			}
			else
			{
				System.out.println(brr[i] + "is Not Armstrong");
			}
		}

	}

}
