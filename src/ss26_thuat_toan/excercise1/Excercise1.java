package ss26_thuat_toan.excercise1;

import java.util.ArrayList;
import java.util.List;

public class Excercise1 {
    public static boolean checkEqualFrequency(int[] arr) {
        List<Integer> newArray = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (!newArray.contains(arr[i])) {
                newArray.add(arr[i]);
            }
        }
        for (int i = 0; i < newArray.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (newArray.get(i) == arr[j]) {
                    count++;
                }
            }
            countList.add(count);

        }
        for (int i = 0; i < countList.size()-1; i++) {
            if (countList.get(i) != countList.get(i + 1)) {
                flag = false;
                break;
            }

        }

        return flag;
    }
}


