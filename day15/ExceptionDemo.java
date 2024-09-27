package day15;

public class ExceptionDemo {

	public static void main(String[] args) {

		boolean result=test();
		System.out.println(result);
	}

	private static boolean test() //if the code goes in try it has to 100% go into finally
	{
		try
		{
			int ans=10/0;		//exception
			return true;
		}
		catch(ArithmeticException e)
		{
			return false;
		}
		finally
		{
			return true;
		}
	}

}
