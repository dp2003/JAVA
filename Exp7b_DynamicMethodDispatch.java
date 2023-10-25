import java.util.Scanner;
interface Figure
{
	double area();
}
	
class Rectangle implements Figure 
{
	double dim1,dim2;
	Rectangle(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	public double area()
	{
		System.out.println("Inside Area of Rectangle: ");
		return dim1*dim2;
	}
}
class Triangle implements Figure
{
	double dim1,dim2;
	Triangle(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	public double area()
	{
		System.out.println("Inside Area of Triangle: ");
		return dim1*dim2;
	}
}
class Exp7b_DynamicMethodDispatch
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);

		Figure f;
		f=r;
		System.out.println("Area is :"+f.area());
		f=t;
		System.out.println("Area is :"+f.area());
	}
}