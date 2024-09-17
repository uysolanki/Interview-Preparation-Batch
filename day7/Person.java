package day7;

import java.util.Scanner;

public class Person {
			protected long adharNo;				//Total DM : 3
			protected String name;
			protected int age;
			
			public void acceptPerson()			//Total Methods :2
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Adhar No");
				this.adharNo=sc.nextLong();
				System.out.println("Enter Name");
				this.name=sc.next();
				System.out.println("Enter Age");
				this.age=sc.nextInt();
			}
			
			public void displayPerson()
			{
				System.out.println("Adhar No is "+this.adharNo);
				System.out.println("Name is "+this.name);
				System.out.println("Age is "+this.age);
			}
			
}
