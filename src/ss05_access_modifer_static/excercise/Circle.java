package ss05_access_modifer_static.excercise;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius) * 3.14;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
    }
}
