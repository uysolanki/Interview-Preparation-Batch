package day4;

import java.util.Scanner;

public class ProblemStatement2 {

	public static void main(String[] args) {
		int rno;
		Scanner sc=new Scanner(System.in);
		
		int n;
		int sum=0; //target achived  N      Y
		int target=50;	//sum 0      12     57 
		for(rno=1;rno<=5;rno++)    //12  5  45  8  25
		{
			System.out.print("Enter Number of chocolates bought");
			n=sc.nextInt();
			
			if(n<10)
			{
				continue;
			}
			else
			{
				sum=sum+n;
				if(sum>=target)
				{
					break;
				}
			}
		}	
		System.out.println(sum);	
	}
}
