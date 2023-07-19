package ss12_java_collection_framework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountElements {
        public static  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input String");
            String string = scanner.nextLine();
            Character keys;
            Map<Character,Integer> treeMap = new TreeMap<>();
            for (int i = 0; i < string.length();i++){
                keys = string.charAt(i);
                if (treeMap.containsKey(keys)){
                    int count = treeMap.get(keys);
                    treeMap.put(keys,count + 1);
                }else {
                    treeMap.put(keys,1);
                }
            }
            System.out.println(treeMap);
        }
    }

