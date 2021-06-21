class Test {

    public static void main(String[] args) {


        Shape [] shape = new Shape[5];

        Circle circle = new Circle();
        shape[0] = circle;

        Shape3D sphere = new Sphere();
        shape[1] = sphere;

        Shape3D cube = new Cube();
        cube.calcVolume();
        shape[2] = (Shape) cube;

        Square square = new Square();
        shape[3] = square;

        Shape3D pip = new Parallelipiped();
        shape[4] = pip;


        int x = 4;
        int z = 1;


        for(Shape shape1 : shape) {
            System.out.println("The calcSurfaceArea of the circle is " + shape1.calcSurfaceArea());
            System.out.println("The calcVolume of the circle is " + shape1.calcVolume());
            x++;
            z++;
            System.out.println("Found in " + shape1.getClass());
            System.out.println(" ");

        }

    }
}
interface Shape3D extends Shape{

    public abstract double calcVolume();

}
class Cube implements Shape3D{

    double a = 5;


    public double calcVolume() {
        return a*a*a;
    }

    public double calcSurfaceArea() {
        return 6*a*a;
    }


}
class Square implements Shape {

    double s = 5;

    public double calcSurfaceArea() {
        return s*s;

    }

    @Override
    public double calcVolume() {
        // TODO Auto-generated method stub
        return 0;
    }   
}
class Circle implements Shape {

    double r = 9;

    public double calcSurfaceArea() {
        return r*r*3.14;

    }

    @Override
    public double calcVolume() {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Sphere implements Shape3D {

    double r1 = 5;

    public double calcVolume() {
        return ( 4.0 / 3.0 ) * Math.PI * Math.pow( r1, 3 );
    }


    public double calcSurfaceArea() {
        return 4*3.14*r1*r1;
    }
}

class Parallelipiped implements Shape3D{
    double a=5;
    double b=3;
    double c=2;

    public double calcVolume(){
        return a*b*c;
    }

    public double calcSurfaceArea(){
        return (2*(a*b + b*c + a*c));
    }
}




interface Shape{

    double calcSurfaceArea();

    double calcVolume();

}