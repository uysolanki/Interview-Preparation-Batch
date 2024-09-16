package day6;

import java.util.Scanner;

public class PrimeNumberCandidate1 {

	public static void main(String[] args) {
		//divisible by 1 & by itself only
		//7 is prime 	
		//1								7
		int iterationCounter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int counter=0;
		for(int i=1;i<=n;i++)					//	i	   n=8			counter=0
		{		
				iterationCounter++;								//	1					    1
				if(n%i==0)						//  2						2
				{								//	3						2
					counter++;					//	4						3		
				}								//	5						3
		}										//  6						3		
												//  7						3
												//  8						4
		if(counter==2)							//  9
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
		System.out.println("Iteration Counter "+ iterationCounter);
	}

}


/*  
Time Complexity 
T(n) = O(n)

Enter a number
97
Prime
Iteration Counter 97
*/