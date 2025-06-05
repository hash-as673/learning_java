abstract class Shape{
    String color;
    abstract double area();
    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor() {return color;};
}

class Circle extends Shape{
    double radius;
    public Circle(String color , double radius){
        super(color);
        System.out.println("Color constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius,2);
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",22);
        System.out.println(s1.getColor());
        System.out.println(s1.area());
    }

}
