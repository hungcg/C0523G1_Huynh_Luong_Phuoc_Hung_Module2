package ss03_array_java.excercise;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your quantity collunm of Matrix: ");
        int col = scanner.nextInt();
        System.out.println("Enter your quantity row of Matrix:");
        int row = scanner.nextInt();
        double array[][] = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element of row Matrix " + i + " element of collumn Matrix " + j + ": ");
                array[i][j] = scanner.nextDouble();
            }
            System.out.println("Matrix iz : ");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("max of Matrix is: " + max);
    }
}
