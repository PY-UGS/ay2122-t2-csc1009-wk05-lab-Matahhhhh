package lab5q2;

public class Square extends Shape {
    public Square(double breadth, double length){
        super(breadth, length);
    }

    public double area(){
        System.out.println("\nInside Area for Square.");
        return this.getDim1() * this.getDim2();
    }
}
