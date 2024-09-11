package day3;

public class EnhancedForLoop {

	public static void main(String[] args) {
		//          0  1  2  3  4
		int arr[]= {10,20,30,40,50,60,70};
		
		int sum=0;
		for(int i=0;i<arr.length;i++)		//i				arr[i]			sum
		{									//0				10				0
			sum=sum+arr[i];					//								10
		}
		
		System.out.println(sum);
//		int sum=0;
//		for(int n :arr)						//sum 		n
//		{									//0			10
//			sum=sum+n;						//10		20
//		}									//30		30
//		System.out.println(sum);			//60		40
	}										//100		50
											//150  
}
