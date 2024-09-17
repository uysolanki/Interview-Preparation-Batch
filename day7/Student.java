package day7;

public class Student {
	
	private int rno;
	private String sname;
	private double per;
	
	
	public void function1()
	{
		Student akash=new Student(); //syntax to create an object in java
									 //classname objectname = new classname
		akash.rno=18;
		akash.sname="Akash Mukesh Ambani";
		akash.per=78.5;
		akash.function2();
	}
	public void function2()
	{
		System.out.println("hi");
	}
}
