package ss26_thuat_toan.excercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise7 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> arary(int[][] array) {
        List<Integer> primeArray = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray.add(array[i][j]);
            }
        }
        for (int i = 0; i < newArray.size(); i++) {
            if (isPrime(newArray.get(i))) {
                primeArray.add(newArray.get(i));
            }
        }
        for (int i = 0; i < primeArray.size() - 1; i++) {
            for (int j = i + 1; j < primeArray.size(); j++) {
                if (primeArray.get(i).equals(primeArray.get(j))) {
                    primeArray.remove(primeArray.get(i));
                    i--;
                }
            }
        }
        Collections.sort(primeArray);
        return primeArray;
    }
}

