package lab5q2;

public class Ellipse extends Shape{
    public Ellipse(double major_axis, double minor_axis){
        super(major_axis, minor_axis);
    }

    public double area(){
        System.out.println("\nInside Area for Ellipse.");
        return this.getPI() * this.getDim1() * this.getDim2();
    }
}
