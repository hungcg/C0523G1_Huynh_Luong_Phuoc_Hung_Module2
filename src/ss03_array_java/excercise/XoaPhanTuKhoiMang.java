package ss03_array_java.excercise;

import sun.awt.windows.WPrinterJob;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" - nhập vị trí số cần xóa");
        Scanner position = new Scanner(System.in);
        int index = position.nextInt() - 1;
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = 0;
        }
        System.out.println("Mảng mới sau khi xóa "+Arrays.toString(array));
    }
}

