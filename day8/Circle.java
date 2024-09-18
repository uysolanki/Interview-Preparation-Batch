package day8;

public class Circle implements ShapeCalc
{

	@Override
	public double area() {
		return 3.14*5*5;
	}

	@Override
	public double perimeter() {
		return 2*3.14*5;
	}

}
