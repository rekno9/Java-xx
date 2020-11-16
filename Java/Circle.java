public class Circle extends Geometry{
    private static double radius;

    public Circle(double radius){
        Circle.radius = radius;
    }

    public  double Area(){
        return (Math.PI * Math.pow(radius, 2));
    }
    public  double Circumference(){
        return 2 * Math.PI * radius;
    }


}