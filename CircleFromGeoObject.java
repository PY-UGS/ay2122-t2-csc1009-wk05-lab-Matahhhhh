import java.lang.Math;

public class CircleFromGeoObject extends GeometricObject{
    private double radius;
    
    public CircleFromGeoObject(double radius, String color, boolean filled){
        super(color,filled);
        setRadius(radius);
    }

    public CircleFromGeoObject(double radius){
        super();
        setRadius(radius);
    }

    public CircleFromGeoObject(){
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return Math.PI*this.radius*2;
    }

    public double getDiameter(){
        return 2*this.radius;
    }

    public void printCircle(){
        System.out.print("Printing circle");
    }
}
