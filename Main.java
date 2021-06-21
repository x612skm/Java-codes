interface shape3 
{
    public abstract double calcVolume();
    public abstract double calcSurfaceArea();  
}
class Parallelepiped implements shape3{
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
class Cube implements shape3{
    double a = 5;


    public double calcVolume() {
        return a*a*a;
    }

    public double calcSurfaceArea() {
        return 6*a*a;
    }
	
}
class Sphere implements shape3{
    double r1 = 5;

    public double calcVolume() {
        return ( 4.0 / 3.0 ) * Math.PI * Math.pow( r1, 3 );
    }


    public double calcSurfaceArea() {
        return 4*3.14*r1*r1;
    }
	
}
public class Main{
    public static void main(String[] args){
        Parallelepiped pip = new Parallelepiped();
        Cube cu = new Cube();
        Sphere sp = new Sphere();

       /* System.out.println(" volume of pip is : \n surface area of pip is : " +pip.calcVolume() +pip.calcSurfaceArea());
        System.out.println(" volume of pip is : \n surface area of pip is : " +cu.calcVolume() +cu.calcSurfaceArea());
        System.out.println(" volume of pip is : \n surface area of pip is : " +sp.calcVolume() +sp.calcSurfaceArea());
        */
       System.out.println("*********** parallelepiped *************");
        System.out.println(" volume of pip is :" +pip.calcVolume());
        System.out.println(" surface area of pip is :" +pip.calcSurfaceArea());
        System.out.println("*********** cube *************");
        System.out.println(" volume of cube is :" +cu.calcVolume());
        System.out.println(" surface area of cube is :" +cu.calcSurfaceArea());
        System.out.println("*********** sphere *************");
        System.out.println(" volume of sphere is :" +sp.calcVolume());
        System.out.println(" surface area of sphere is :" +sp.calcSurfaceArea());
    }
}
