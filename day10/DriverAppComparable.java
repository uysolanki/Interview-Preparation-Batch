package day10;

import java.util.ArrayList;
import java.util.Collections;

public class DriverAppComparable {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(1,"Rahul",98.5);
		Student s4=new Student(93,"Bumrah",68.5);
		Student s5=new Student(77,"Shubman",87.5);
		
		
		ArrayList<Student> academicStudents=new ArrayList<Student>();
		academicStudents.add(s1);
		academicStudents.add(s2);
		academicStudents.add(s3);
		academicStudents.add(s4);
		academicStudents.add(s5);
		System.out.println(academicStudents);
		Collections.sort(academicStudents,new PerComparator());
		System.out.println("Academic Performace List of Students");
		for(Student s : academicStudents)
		{
			System.out.println(s);
		}
		
		
		Collections.sort(academicStudents,new NameComparator());
		System.out.println("exam Seating List of Students");
		for(Student s : academicStudents)
		{
			System.out.println(s);
		}
		
		Collections.sort(academicStudents,new RnoComparator());
		System.out.println("Pending College Fees List of Students");
		for(Student s : academicStudents)
		{
			System.out.println(s);
		}
	}

}
