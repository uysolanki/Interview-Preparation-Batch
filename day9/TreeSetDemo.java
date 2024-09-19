package day9;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet();
		names.add("Alice");  //0
		names.add("Chris");  //1
		names.add("Elcid");  //2
		names.add("David");  //3
		names.add("Ben");    //4
		names.add("Elcid");  //2
		names.add("David");  //3
		names.add("Ben"); 
		
		System.out.println(names);
		System.out.println(names.size());

	}

}
