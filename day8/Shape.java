package day8;

public class Shape {
		public double area(int radius)
		{
			return 3.14*radius*radius;
		}
		
		public double area(int length,int breadth)
		{
			return length*breadth;
		}
		
		public double area(int length,double breadth)
		{
			return length*breadth;
		}
		public double area(double length,int breadth)
		{
			return length*breadth;
		}
		public double area(double length,double breadth)
		{
			return length*breadth;
		}
}
