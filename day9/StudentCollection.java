package day9;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCollection {

	public static void main(String[] args) {
	Student s1=new Student(18,"Virat",78.5);
	Student s2=new Student(45,"Rohit",88.5);
	Student s3=new Student(1,"Rahul",98.5);
	Student s4=new Student(93,"Bumrah",68.5);
	Student s5=new Student(77,"Shubman",87.5);
	
	
	ArrayList<Student> students=new ArrayList<Student>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	students.add(s5);
	
	System.out.println("Size of Students " +students.size());
	//display name of Student no 3
	//System.out.println(students.get(2).getSname());
    double totalPer=0;
//	for(int i=0;i<students.size();i++)
//	{
//		totalPer += students.get(i).getPer();
//	}
    
    for(Student s:students)
    	totalPer += s.getPer();
    
	
	System.out.println("Total Percentage " +totalPer);
	System.out.println("Avg Percentage " +totalPer/students.size());
	System.out.println("Is the Students ArrayList Empty "+students.isEmpty());
	students.clear();
	System.out.println("Is the Students ArrayList Empty "+students.isEmpty());
	}

}
