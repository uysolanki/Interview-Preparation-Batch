package day9;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
//		Vector<Integer> v1=new Vector();
//		
//		for(int i=1;i<=10;i++)
//			v1.add(i);
//		
//		System.out.println("Capacity "+v1.capacity());
//		System.out.println("Size "+ v1.size());
//		
//		v1.add(11);
//		
//		System.out.println("Capacity "+v1.capacity());
//		System.out.println("Size "+ v1.size());
		
//		Vector<Integer> v1=new Vector(5);
//		System.out.println("Capacity "+v1.capacity());
//		System.out.println("Size "+ v1.size());
//		
//		for(int i=1;i<=5;i++)
//			v1.add(i);
//		
//		System.out.println("Capacity "+v1.capacity());
//		System.out.println("Size "+ v1.size());
//		
//		v1.add(6);
//		
//		System.out.println("Capacity "+v1.capacity());
//		System.out.println("Size "+ v1.size());
		
		Vector<Integer> v1=new Vector(5,3);
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Size "+ v1.size());
		
		for(int i=1;i<=5;i++)
			v1.add(i);
		
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Size "+ v1.size());
		v1.add(6);
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Size "+ v1.size());
		
	}

}
