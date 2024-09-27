package day15;

public class CallByRef {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30};
		System.out.println("A :"+arr[0]);
		test(arr);	//Actual Parameter	//Paramaeter is an array, array is NP, NP is passed by ref
		System.out.println("A :"+arr[0]);
	}

	private static void test(int[] brr) //Formal Parameter
	{
		System.out.println("Z :"+brr[0]);
		brr[0]=99;
		System.out.println("Z :"+brr[0]);
	}
	
}
