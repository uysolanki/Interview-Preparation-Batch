package day7;

import java.util.Scanner;

public class Employee extends Person
{
			private int eno;				//Total DM : 6
			private String desg;
			private double sal;
			
			public void acceptEmployee()			//Total Methods :4
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Employee No");
				this.eno=sc.nextInt();
				System.out.println("Enter Employee Designation");
				this.desg=sc.next();
				System.out.println("Enter Employee Salary");
				this.sal=sc.nextDouble();
			}
			
			public void displayEmployee()
			{
				System.out.println("Employee No is "+this.eno);
				System.out.println("Employee Designation "+this.desg);
				System.out.println("Employee Salary "+this.sal);
			}
	
}
