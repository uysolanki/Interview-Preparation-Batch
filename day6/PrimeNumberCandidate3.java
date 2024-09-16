package day6;

import java.util.Scanner;

public class PrimeNumberCandidate3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int iterationCounter=0;
		int i,flag=0;						//flag as a boolean var either 0 or 1 , assume its a prime
		for(i=2 ;i<=n/2;i++)
		{
			iterationCounter++;
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		System.out.println("Iteration Counter "+ iterationCounter);
	}
}

/*  
Time Complexity 
T(n) = O(n/2) - 1

Enter a number
97
Prime
Iteration Counter 47
*/