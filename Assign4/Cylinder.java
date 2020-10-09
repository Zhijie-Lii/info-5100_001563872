

public class Cylinder extends Circle{
    private double height;


    Cylinder(){
        // public void ?
    }

    public void Cylinder(double height){
        this.height = height;
    }

    Cylinder(double height, double radius){
        super(radius);
        this.height = height;

    }

    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        double volume = getArea() * height*2;
        return volume;
    }

    @Override
    public double getArea() {
        double areaOfCyclinder;
        areaOfCyclinder = super.getArea()*2 + 2* Math.PI * radius * height;
        return areaOfCyclinder;
    }
}

