package ss26_thuat_toan.excercise5;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 ={-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(Excercise5.sortByHeight(array1)));
        int[] array2 ={-1, 150, 165, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(Excercise5.sortByHeight(array2)));
        int[] array3 ={150, -1, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(Excercise5.sortByHeight(array3)));
        int[] array4 ={-1, 150, 190, 170, -1, -1, 160, -1};
        System.out.println(Arrays.toString(Excercise5.sortByHeight(array4)));
        int[] array5 ={-1, 150, -1, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(Excercise5.sortByHeight(array5)));
    }
}
