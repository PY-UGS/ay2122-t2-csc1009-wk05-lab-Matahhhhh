package lab5q2;

public class TestShapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape figref; // this is OK, no object is created

        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.printf("Area is %.1f" , figref.area());
        figref = e;
        System.out.printf("Area is %.2f" , figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
