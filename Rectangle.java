package lab5q2;

public class Rectangle extends Shape{
    
    public Rectangle(double height, double width){
        super(height,width);
    }

    public double area(){
        System.out.println("\nInside area for Rectangle.");
        return this.getDim1() * this.getDim2();
    }
}
