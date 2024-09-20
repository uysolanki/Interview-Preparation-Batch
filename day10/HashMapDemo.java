package day10;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> m100 =new HashMap();
		m100.put("first", "Alice");
		m100.put("second", "Ben");
		m100.put("third", "Chris");
		System.out.println(m100);
		
		HashMap<String,String> m200 =new HashMap();
		m200.put("first", "David");
		m200.put("second", "Elcid");
		m200.put("third", "Frank");
		System.out.println(m200);
		
		HashMap<String,String> m800 =new HashMap();
		m800.put("first", "George");
		m800.put("second", "Henry");
		m800.put("third", "Ian");
		System.out.println(m200);
		
		//display name of the athlete who came second in the 100m race?
		
		//System.out.println(m100.get("second"));
		
		//display name of the athlete who came first in the 200m race?
		
		//System.out.println(m200.get("first"));
		
		ArrayList<HashMap<String,String>> olympic=new ArrayList();
		olympic.add(m100);  //0
		olympic.add(m200);  //1
		olympic.add(m800);  //2
		
//		System.out.println(olympic.get(0).get("third"));
//		System.out.println(olympic.get(1).get("first"));
		//display name of the athletes who came first in both the races?
		
		for(int i=0;i<olympic.size();i++)
		{
			System.out.println(olympic.get(i).get("first"));
		}
			
	}

}
