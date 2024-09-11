package day3;

public class ConditionalStatementDemo {

	public static void main(String[] args) {
		int n1=1000;
		int n2=5000;
		int max;         

//		if(n1>=n2)   //is 100 >= 500  False
//		{
//			max=n1;   //max=100
//		}
//		else
//		{
//			max=n2;   //max=500
//		}
		
		
		                    //True       False
		//max=n1>=n2?n1:n2;
		
		System.out.println(n1>=n2?"Maximum Number is "+n1 : "Maximum Number is "+n2);

	}

}
