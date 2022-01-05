import java.text.DecimalFormat;

public class Circle extends Geometry{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*Math.PI;
    }

    public void printCircle(){
        System.out.println("Dien tich hinh tron la: "+ area() + " Chu vi hinh tron la: " + perimeter());
    }
}
