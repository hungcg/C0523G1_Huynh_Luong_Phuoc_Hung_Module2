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
//        List<Integer> newArray = myTransfer(array);
//
//        for (int i = 1; i < newArray.size() - 1; i++) {
//            int sum1 = 0;
//            for (int j = 0; j < i; j++) {
//                sum1 += newArray.get(j);
//            }
//            int sum2 = 0;
//            for (int j = i + 1; j < newArray.size(); j++) {
//                sum2 += newArray.get(j);
//
////        int sum2 = 0;
////        for (int i = 0; i < newArray.size(); i++) {
////            sum2 += newArray.get(i);
////            if ((sum - newArray.get(i)) / 2 == sum2 - newArray.get(i)) {
//                if (sum1 == sum2) {
//                    return true;
//                }
//            }
//        }
//        return false;
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





