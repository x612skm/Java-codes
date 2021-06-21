import java.util.*;
import java.util.Scanner;
//constructors
abstract class Shape
{   //basic structure for the constructers
    int dim1,dim2,dim3;
    Shape() //defined as the neutral shape that will be processed 
    {
        dim1=dim2=dim3=0;
    }
    Shape(int width,int height,int d3)//making it as a user defined
    {
        dim1=width;//loading the values
        dim2=height;
        dim3=d3;
    }
    abstract double getArea();//geting the area for the following inside the structures not public double as the abstract class
}

class Rectangle extends Shape
{
   int dim1,dim2;
   //making the constructer
    Rectangle(){}
    
    Rectangle(int b,int h)
    {
        dim1=b;//loading the values inside it
        dim2=h;
    }
    @Override
    //geting the area
    public double getArea()
    {
        return dim1*dim2;// length * breadth
    }
}

class Square extends Shape
{
   int dim1;
    Square(){}
    Square(int d)
    {
        dim1=d;
    }
    @Override
    public double getArea()
    {
        return dim1*dim1;
    }
}
//this is not in the hirechial table so using it as a final class 
final class Triangle extends Shape
{
   int dim1,dim2;
    Triangle(){}
    Triangle(int b,int h)
    {
        dim1=b;
        dim2=h;
    }
    public double getArea()
    {
        return 0.5*dim1*dim2;
    }
}
class Circle extends Shape
{
   int dim1;
    Circle(){}
    Circle(int rad)
    {
        dim1=rad;
    }
    @Override
    public double getArea()
    {
        return 3.14*dim1*dim1;
    }
}
//this following starts as the multilevel inheritance 
class Parallelepiped extends Rectangle
{
   int dim1,dim2,dim3;
    Parallelepiped(){}
    Parallelepiped(int width,int height,int d3)
    {
        dim1=width;
        dim2=height;
        dim3=d3;
    }
    @Override
    public double getArea()
    {
        return 2*(dim1*dim2+dim1*dim3+dim2*dim3);
    }
}

class Cube extends Square
{
   int dim1;
    Cube(){}
    Cube(int width)
    {
        super(width);
    }
    @Override
    public double getArea()
    {
        return 6*super.getArea();
    }
}

class Sphere extends Circle
{
   int dim1;
    Sphere()
    {
    }
    Sphere(int width)
    {
        super(width);
    }
    @Override
    public double getArea()
    {
        return 4*super.getArea();
    }
}
 class Main
{
    public static void main(String[] args)
     { //defining the following datas
        Rectangle rec = new Rectangle(5,3);
       Square sq=new Square(2);
       Cube cu = new Cube(3);
      Circle cir=new Circle(2);
      Triangle tri =new Triangle(2,3);
      Sphere sph =new Sphere(5);
      Parallelepiped pp = new Parallelepiped(3,4,5);
      //getiing the outputs printed
      System.out.println("area of rectangle is: " +rec.getArea());
      System.out.println("area of cube is : " +cu.getArea());
      System.out.println("area of square : "+sq.getArea());      
      System.out.println("area of triangle : "+tri.getArea());
      System.out.println("area of sphere : "+sph.getArea());
      System.out.println("area of circle :: "+cir.getArea());
      System.out.println("area of parallelepiped "+pp.getArea());

    }
}