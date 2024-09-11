package day3;

public class WhileLoopDemo {

	public static void main(String[] args) {
		//         start            till when will the loop execute ;  progress the loop to its termination  
		// 3 parts Initialization ; Condition ;                        inc/dec
		
		int i=1;   //initialization
		
		while(i<=5)	//condition 			//i							output
		{	
			System.out.println("ExcelR"+i); //1    is 1<=5  True		ExcelR1		ExcelR1
			i=i+2; //increment							
		}									//3    is 3<=5  True        ExcelR3		ExcelR3
										
											//5	   is 5<=5  True        ExcelR5  	ExcelR5
											//7    is 7<=5  False		Terminate the loop

	}

}


//