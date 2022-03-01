package lab5q2;

public class Circle extends Shape{

    public Circle(double radius1, double radius2){
        super(radius1,radius2);
    }
    
    public double area(){
        System.out.println("Inside Area for Circle.");
        return this.getDim1() * this.getDim2() * this.getPI();
    }
}
