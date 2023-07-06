package ss03_array_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("nhập số cần thêm vào");
        Scanner number = new Scanner(System.in);
        int addNumber = number.nextInt();
        System.out.println("nhập vào vị trí muốn thêm");
        int index = number.nextInt() - 1;
        int newArray[] = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = newArray.length - 1; i >= index; i--) {
            newArray[i] = newArray[i - 1];
            if (index == i) {
                newArray[i] = addNumber;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
