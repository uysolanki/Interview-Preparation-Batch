package day3;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)						//i
		{											//1		is 1%2==1 True
			if(i%2==1)								//2		is 2%2==1 False  ExcelR2
			{										//3     is 3%2==1 True
				continue;							//4		is 4%2==1 False  ExcelR4  6  8  10	
			}
			else
			{
			System.out.println("ExcelR"+i);
			}
		}

	}

}
