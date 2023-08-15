package ss26_thuat_toan.excercise3;

import java.util.ArrayList;
import java.util.List;

public class Excercise3 {

    public static List<Integer> myTransfer(int[] array) {
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            newArray.add((array[i]));
        }
        return newArray;
    }

    public static boolean beautifulArray(int[] array) {
            double sum = 0;
            double sum2 = 0;

            for (int i = 0; i < array.length; ++i) {
                sum += array[i];
            }
            for (int i = 0; i < array.length; ++i) {
                sum2 += array[i];
                if ((sum - array[i]) / 2 == sum2 - array[i]) {
                    return true;
                }
            }
            return false;
        }
    }





