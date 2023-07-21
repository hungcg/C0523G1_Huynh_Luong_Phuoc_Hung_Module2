package ss15_exception_debug.excercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] args) throws Exception {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("input side a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("input side b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("input side c");
                double c = Double.parseDouble(scanner.nextLine());
                triangle(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("side of triangle must be > 0, try again");
        } else if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new IllegalTriangleException("sumary of 2 side must be > another one, try again");
        } else {
            System.out.println("Yeahhhhh bro,Triangle abc with 3 side: a = " + a + " ; b = " + b + " ; c = " + c);
        }
    }
}


