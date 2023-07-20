package ss13_thuat_toan_tim_kiem.excercise;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's up bro,let input size of array");
        int size = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            System.out.println("input element  " + (i + 1));
            int element = scanner.nextInt();
            array.add(element);
        }
        array.sort((o1, o2) -> o1 - o2);
        System.out.println(array);
        System.out.println("input the number u wanna find");
        int number = scanner.nextInt();
        binarySearch(array, number);
    }

    public static void binarySearch(List<Integer> newList, int value) {
        int left = 0;
        int right = newList.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (value < newList.get(middle)) {
                right = middle - 1;
                System.out.println("the number u find never exist here");
                break;
            } else if (value == newList.get(middle)) {
                System.out.println("the number u find iz here bro " + '[' + value + ']');
                break;
            } else {
                left = middle + 1;
                System.out.println("the number u find never exist here");
                break;
            }
        }
    }
}
