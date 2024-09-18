package day8;

public class Abhishek extends Amitabh
{
	public void car()
	{
		System.out.println("Audi");
	}
	
//	@Override
//	public void home()  //in the subclass writing function with the same name and same parameter list
//	{					//is called as function overriding.
//		System.out.println("New Jalsa");
//	}
	
	public void home(int x)  //function overloading
	{
		System.out.println("Mannat..");
	}
}
