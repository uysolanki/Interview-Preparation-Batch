package day9;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		
	ArrayList<String> names=new ArrayList();
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
	
	names.add(1,"Frank");
	System.out.println(names);
	
	
	}
}
