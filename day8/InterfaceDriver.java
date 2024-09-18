package day8;

public class InterfaceDriver {

	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println("Area of Circle "+c1.area());
		System.out.println("Perimeter of Circle "+c1.perimeter());
		
		NewRectangle r1=new NewRectangle();
		System.out.println("Area of Rectangle "+r1.area());
		System.out.println("Perimeter of Rectangle "+r1.perimeter());
	}
}
