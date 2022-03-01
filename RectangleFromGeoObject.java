public class RectangleFromGeoObject extends GeometricObject {
    private double width;
    private double height;

    public RectangleFromGeoObject(){
        super();
    }

    public RectangleFromGeoObject(double width, double height) {
        super();
        setWidth(width);
        setHeight(height);
    }

    public RectangleFromGeoObject(double width, double height, String color, boolean filled){
        super(color,filled);
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        double area = 0;
        area = width * height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 0;
        perimeter = 2*width + 2*height;
        return perimeter;
    }
}
