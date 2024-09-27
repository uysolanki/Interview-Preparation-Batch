package day15;

public class CallByRefObject {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",78.5);
		System.out.println(s1); //expecting as String we have provided object
							    //we need some mechanism in a class to convert object to String
		test(s1);  				//passing an object, object is NP, NP are passed by Call by ref
		
		System.out.println(s1);
	}

	private static void test(Student t1) {
		t1.setSname("Rohit");
	}
}
