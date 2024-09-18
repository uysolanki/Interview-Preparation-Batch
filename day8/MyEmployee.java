package day8;

import java.util.Scanner;

public abstract class MyEmployee {

	protected int eno;				//Total DM : 6
	protected String desg;
	protected double sal;
	protected double commision;
	
	public void acceptEmployee()			//Total Methods :4
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee No");
		this.eno=sc.nextInt();
		System.out.println("Enter Employee Designation");
		this.desg=sc.next();
		System.out.println("Enter Employee Salary");
		this.sal=sc.nextDouble();
		System.out.println("Enter Employee Commision");
		this.commision=sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee No is "+this.eno);
		System.out.println("Employee Designation "+this.desg);
		System.out.println("Employee Salary "+this.sal);
		System.out.println("Employee Commision "+this.commision);
	}
	
	abstract public void calculateTotalIncome();
}
