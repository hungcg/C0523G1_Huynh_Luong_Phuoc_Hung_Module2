package ss06_inheritance.practice;

public class Circle extends Shape {

    public Circle(boolean filled, String color, double radius) {
        super(color, filled);
        this.radius = radius;

    }

    protected double radius = 1.0;

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return (radius * radius) * 3.14;
    }

    protected double getPerimeter() {
        return radius * 2 * 3.14;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius()
                + ", which is a subclass of "
                + "Perimeter= " + getPerimeter()
                + " ,Area= " + getArea()
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circleOne = new Circle(true, "red", 3);
        circleOne.getArea();
        circleOne.getArea();
        System.out.println(circleOne);
    }
}
