package day4;

public class ProblemStatement {

	public static void main(String[] args) {
		
		int rno=1;		//initialization
		int sum=0;
		while(rno<=5)   //condition					rno			sum
		{										//  1			0
			sum=sum+rno;						//	2			1
			rno++;     //increment					3			3
		}										//	4			6
		System.out.print(sum);					//	5			10
	}											//	6			15

}
