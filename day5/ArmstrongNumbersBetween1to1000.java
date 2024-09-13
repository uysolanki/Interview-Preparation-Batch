package day5;

public class ArmstrongNumbersBetween1to1000 {

	public static void main(String[] args) {
		System.out.println("Armstrong Numbers between 1 to 1000");
		
		for(int number=1;number<=1000000;number++)		//number			n		r  		sum
		{                                           //153				153     3     	0
		int n=number;								//					15		5       27	
		int r,sum=0;								//					1		1		152
		while(n>0)									//					0				153
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}

		if(number==sum)
		{
			System.out.println(number);
		}
		}

	}

}
