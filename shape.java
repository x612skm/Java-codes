import java.util.Scanner;
 
abstract class calcArea {
    abstract void findTriangle(double b, double h);
    abstract void findRectangle(double l, double b);
    abstract void findSquare(double s);
    abstract void findCircle(double r);
}
 
class findArea extends calcArea {
 
    void findTriangle(double b, double h)
    {
        double area = (b*h)/2;
        System.out.println("Area of Triangle: "+area);
    }
 
    void findRectangle(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
    void findSquare(double s)
    {
        double area = s*s;
        System.out.println("Area of Square: "+area);
    }
     
    void findCircle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
class area {
    public static void main(String args[])
    {
        double l, b, h, r, s;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);
 
        System.out.print("\nEnter Base & Vertical Height of Triangle: ");
        b = get.nextDouble();
        h = get.nextDouble();
        area.findTriangle(b, h);
 
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = get.nextDouble();
        b = get.nextDouble();
        area.findRectangle(l, b);
 
        System.out.print("\nEnter Side of a Square: ");
        s = get.nextDouble();
        area.findSquare(s);
 
        System.out.print("\nEnter Radius of Circle: ");
        r = get.nextDouble();
        area.findCircle(r);
    }
}   

