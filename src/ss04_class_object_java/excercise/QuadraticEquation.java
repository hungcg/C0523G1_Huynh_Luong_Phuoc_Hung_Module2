package ss04_class_object_java.excercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;


    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * (a * c));
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()) / 2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()) / 2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1 = " + quadraticEquation.getRoot1() + " Root 2= " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else {
            System.out.println("The equation only one roots: " + quadraticEquation.getRoot1());

        }
    }


}
