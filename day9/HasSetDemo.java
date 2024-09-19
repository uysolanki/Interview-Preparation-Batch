package day9;

import java.util.HashSet;

public class HasSetDemo {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet();
		names.add("Alice");  //0
		names.add("Chris");  //1
		names.add("Elcid");  //2
		names.add("David");  //3
		names.add("Ben");    //4
		names.add("Elcid");  //2
		names.add("David");  //3
		names.add("Ben");  
		names.add(null);  //2
		names.add(null);  //3
		names.add(null);
		
		System.out.println(names);
		System.out.println(names.size());
	}

}
