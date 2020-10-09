import java.math.*;

public class Circle {
    protected double radius;
    protected String color;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    //public void
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

//    public Circle circle;
//    {
//        circle = new Circle(1, "red") {
//        };
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
}

//    public static void main(String[] args) {
//
////        System.out.println(circle2.getRadius());
////        System.out.println(circle2.getArea());
//    }
//