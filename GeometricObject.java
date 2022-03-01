public class GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreation;

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreation = new java.util.Date();
    }

    public GeometricObject(){
        color = "white";
        filled = false;
        dateCreation = new java.util.Date();
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreation(){
        return dateCreation;
    }

    public String toString(){
        return "is created on " + dateCreation + "\ncolor: " + color + " and filled: " + filled;
    }
}
