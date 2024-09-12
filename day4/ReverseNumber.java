package day4;

import java.util.Scanner;

/*
 		input : 123
		output : 321
 */
public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);			//Dry run

		System.out.print("Enter a number");		//n							r			rev
		int n = sc.nextInt();//123  			 123	is 123>0 true		3			3
		int r;								   //12		is 12>0  true		2			32		    3									
		int rev=0;							   //1	    is 1>0   true	    1           321
		while(n>0)							   //0      is 0>0 false 		
		{
			r=n%10;
			rev=rev*10 + r;
			n=n/10;
		}
		System.out.println(rev);
	}

}
