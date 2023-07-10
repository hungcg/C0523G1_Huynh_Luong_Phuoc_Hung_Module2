package ss06_inheritance.excercise.CircleCylinder;

public class Cylinder extends Circle {
    private double height;

    protected Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                " ,Volume Cylinder = " +
                getVolume() + "}";

    }

    public static void main(String[] args) {
        Cylinder cylinderOne = new Cylinder(30, "blue", 10);
        cylinderOne.setHeight(20);
        cylinderOne.getVolume();
        System.out.println(cylinderOne);
    }
}
