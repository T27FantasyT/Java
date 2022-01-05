public class Square extends Geometry{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 4*width;
    }

    @Override
    public double area() {
        return Math.pow(width,2);
    }

    public void printSquare(){
        System.out.println("Chu vi hinh vuong la: "+ area() + " Dien tich hinh vuong la: "+ area());
    }
}
