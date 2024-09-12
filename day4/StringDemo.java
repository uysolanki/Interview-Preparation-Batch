package day4;

public class StringDemo {

	public static void main(String[] args) {
		String name="Alice";
		String name1="Alice";
		String name2="Ben";
		
		String name3=new String("Alice");
		String name4=new String("Alice");
		
		System.out.println(name==name1);  
		System.out.println(name==name3);
		System.out.println(name.equals(name3));
		

	}

}
