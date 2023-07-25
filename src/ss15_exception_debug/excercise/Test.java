package ss15_exception_debug.excercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws TriangleException {
        TriangleCheck triangle = new TriangleCheck();
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("input side a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("input side b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("input side c");
                double c = Double.parseDouble(scanner.nextLine());
                try {
                    triangle.triangle(a, b, c);
                    break;
                } catch (TriangleException e) {
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException e) {
                System.out.println("Format input error");
            }
        } while (true);
    }
}


