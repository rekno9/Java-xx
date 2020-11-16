public class Circle extends Geometry{
    private static double radius;
    private static double diameter;

    public Circle(double radius, double diameter){
        Circle.radius = radius;
        Circle.diameter = diameter;
    }

    public  double Area(){
        return (Math.PI * Math.pow(radius, 2));
    }
    public  double Circumference(){
        return 2 * Math.PI * radius;
    }


}