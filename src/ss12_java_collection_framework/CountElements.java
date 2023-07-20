package ss12_java_collection_framework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputList = input.split(" ");
        input = input.toLowerCase();
        Map<String, Integer> newArray = new TreeMap<>();
        for (int i = 0; i < inputList.length; i++) {
            if (!newArray.containsKey(inputList[i])) {
                newArray.put(inputList[i], 1);
            } else {
                int value = newArray.get(inputList[i]) + 1;
                newArray.put(inputList[i], value);
            }
        }
        System.out.println(newArray);
    }
}

