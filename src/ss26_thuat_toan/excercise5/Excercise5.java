package ss26_thuat_toan.excercise5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Excercise5 {
    public static int[] sortByHeight(int[] array) {
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                newArray.add(array[i]);
                array[i] = 0;
            }
        }
        newArray.sort(Comparator.naturalOrder());
        for (int i = 0; i < newArray.size(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != -1) {
                    array[j] = newArray.get(i);
                    newArray.remove(newArray.get(i));
                }
            }
        }
        return array;
    }
}
