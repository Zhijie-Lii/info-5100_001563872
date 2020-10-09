

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle2 = new Circle();
        circle2.setRadius(2.0);
        circle2.setColor("yellow");

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColor("red");
        cylinder1.setRadius(1.0);
        cylinder1.setHeight(1.0);

        Cylinder cylinder2 = new Cylinder(5.0, 2.0); // ? not tell double double
        cylinder2.setColor("red");

        System.out.println("Radius is " + circle2.getRadius() + ", Color is " + circle2.getColor() + ", Base area is " + circle2.getArea());
        System.out.println("Radius is " + cylinder1.getRadius() + ", Height is " +cylinder1.getHeight() +", Color is " + cylinder1.getColor() + ", Base area is " + cylinder1.getArea()+", Volume is "+cylinder1.getVolume());
        System.out.println("Radius is " + cylinder2.getRadius() + ", Height is " +cylinder2.getHeight() +", Color is " + cylinder2.getColor() + ", Base area is " + cylinder2.getArea()+", Volume is "+cylinder2.getVolume());
    }
}
