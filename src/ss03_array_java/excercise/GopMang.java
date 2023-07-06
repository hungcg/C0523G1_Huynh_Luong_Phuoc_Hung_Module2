package ss03_array_java.excercise;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int arrayOne[] = {1, 2, 3, 4, 5};
        int arrayTwo[] = {6, 7, 8, 9, 10};
        int arrayThree[] = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayThree[i] = arrayOne[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayThree[i + (arrayOne.length)] = arrayTwo[i];
        }
        System.out.println(Arrays.toString(arrayThree));

    }
}
