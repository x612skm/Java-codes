import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
abstract class Shape{
private double width;
private double height;
private double radius;
public void Shape(double width, double height)
{
this.width = width;
this.height = height;
this.radius = radius;
}
public final double getWidth(){
return width;
}
public final double getHeight(){
return height;
}
public final double getRadius(){
	return radius;
}
abstract double getArea();
}
class rectangle extends Shape
{
	double getArea()
	{
		return getHeight() * getWidth();
	}
}
class square extends Shape
{
	double getArea()
	{
//		getHeight = getWidth ; //error to fix
		return (getHeight() * getHeight());
	}
}
class triangle extends Shape
{
	double getArea()
	{
		return ((getWidth()*getHeight())/2);
	}
}
class circle extends Shape
{
	double getArea()
	{
		
		return (3.14(*getRadius()*getRadius()));
	}
}
class Area
{
	public static void main(String[] args)
	{
		Shape shape;
		// assiging values for rectange
		rectangle rect = new rectangle();
		shape = rect;
		shape.Shape(6,5);
		System.out.println("arear of rectangle is : " +shape.getArea());

		square squ = new square();
		shape = squ;
		shape.Shape(4,4);
		System.out.println("area of square is :\n as the property of square says that height and width are always same " + shape.getArea());

		triangle tri = new triangle();
		shape = tri;
		shape.Shape(4,4);
		System.out.println(" area of triangle is :  " +shape.getArea());

		circle circle = new circle();
		shape = cir;
		shape.Shape(width, height);
		System.out.println(" area of circle is : "+shape.getArea());
	}
}
