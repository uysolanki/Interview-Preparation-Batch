package day5;

public class ImmutableDemo {

	public static void main(String[] args) {
		String firstName="Alice";  //immutable
		//add MiddleName
		//add Surname
		
		String fullName=firstName.concat(" Fernandes");
		System.out.println(firstName);
		System.out.println(fullName);
	}

}
