package ss13_thuat_toan_tim_kiem.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        List<Character> newList = new ArrayList<>();
        List<Character> babyList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("input ur String bro");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            newList.add(string.charAt(i));
            for (int j = i; j < string.length() - 1; j++) {
                if (string.charAt(j + 1) > newList.get(newList.size() - 1)) {
                    newList.add(string.charAt(j + 1));
                } else {
                    break;
                }
            }
//            System.out.println(newList);
//        for (int i = 0; i < newList.size(); i++) {
//            if (newList.get(i) == newList.get(i + 1)){
//                newList.remove(newList.get(i+1));
//            }
            if (newList.size() > babyList.size()) {
                babyList.clear();
                babyList.addAll(newList);
                newList.clear();
            }
            newList.clear();
        }
        for (Character babyString : babyList) {
            System.out.print(babyString);
        }
    }
}





