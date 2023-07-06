package ss03_array_java.excercise;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity collunm of Matrix: ");
        int col = scanner.nextInt();
        System.out.println("Enter quantity row of Matrix:");
        int row = scanner.nextInt();
        int array[][] = new int[row][col];
        System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the element of row  " + i + "& element of collumn " + j + ": ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println();
        int sum = 0;
        int input;
        System.out.println("enter position of columns you want sumary");
        input = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            sum += array[i][input - 1];
        }
        System.out.println("sumary of column : "+ sum);
    }
}




