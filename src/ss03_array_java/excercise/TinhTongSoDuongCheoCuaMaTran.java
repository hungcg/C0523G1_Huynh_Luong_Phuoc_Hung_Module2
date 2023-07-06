package ss03_array_java.excercise;

import java.util.Scanner;

public class TinhTongSoDuongCheoCuaMaTran {
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
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i = 0; i < col; i++) {
            leftSum += array[i][(col - 1) - i];
            rightSum += array[i][i];
            sum = leftSum + rightSum;
        }
        System.out.println();
        System.out.println("Sumary of diagonal line of Matrix : " + sum);
    }


}

