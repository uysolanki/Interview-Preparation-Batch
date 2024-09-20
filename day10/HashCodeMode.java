package day10;

public class HashCodeMode {

	public static void main(String[] args) {
		String name="Alice";
		String name1="Ben";
		
		Student s1=new Student();
		
		System.out.println(name + " : " + name.hashCode());
		System.out.println(name1 + " : " + name1.hashCode());
		System.out.println("S1" + " : " + s1.hashCode());
	}

}
