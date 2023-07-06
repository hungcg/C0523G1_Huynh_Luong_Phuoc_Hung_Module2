package ss02_loop_java.exercise;

import java.util.Scanner;

public class HienThiVeHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the botton-left triangle ");
        System.out.println("3. Draw the top-left triangle ");
        System.out.println("4. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        while (true) {
            label73:
            while (true) {
                int choice = input.nextInt();
                int n;
                int i;
                switch (choice) {
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                        break;
                    case 1:
                        System.out.println("Enter a:");
                        int a = input.nextInt();
                        System.out.println("Enter b:");
                        int b = input.nextInt();

                        for (n = 1; n <= 3; ++n) {
                            for (i = 1; i <= 7; ++i) {
                                System.out.print(" * ");
                            }

                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("Enter n:");
                        n = input.nextInt();
                        i = 1;

                        while (true) {
                            if (i >= n) {
                                continue label73;
                            }

                            for (i = 1; i < i; ++i) {
                                System.out.print("*");
                            }

                            System.out.println();
                            ++i;
                        }
                    case 3:
                        System.out.println("Enter c:");
                        i = input.nextInt();
                        i = 0;

                        while (true) {
                            if (i >= i) {
                                continue label73;
                            }

                            for (i = i; i > i; --i) {
                                System.out.print("*");
                            }

                            System.out.println();
                            ++i;
                        }
                    case 4:
                        System.out.println("Enter d:");
                        i = input.nextInt();

                        for (i = 1; i <= i; ++i) {
                            int k;
                            for (k = i; k > i; --k) {
                                System.out.print(" ");
                            }
                            for (k = 1; k <= i * 2 - 1; ++k) {
                                System.out.print("*");
                                break;
                            }
                            System.out.println();
                        }
                }
            }
        }
    }
}



