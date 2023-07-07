package ss04_class_object_java.practice;

import java.util.Scanner;

public class Rectangle {

    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPrerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=  " + width + ",height =" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Rectangle width");
        double width = scanner.nextDouble();
        System.out.println("enter Rectangle height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Rectangle Area = " + rectangle.getArea());
        System.out.println("Rectangle Prerimeter = " + rectangle.getPrerimeter());
    }
}
