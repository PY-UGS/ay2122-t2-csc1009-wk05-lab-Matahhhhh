package lab5q2;

public class Triangle extends Shape{

    public Triangle(double base, double height){
        super(base, height);
    }

    public double area(){
        System.out.println("Inside area for Triangle.");
        return 0.5 * this.getDim1() * this.getDim2();
    }
}