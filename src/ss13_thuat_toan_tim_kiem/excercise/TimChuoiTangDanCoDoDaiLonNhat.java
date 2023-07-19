package ss13_thuat_toan_tim_kiem.excercise;

import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        String string ="Welcome";
        String newString = "";
        int firstCharacter = string.charAt(0);
        int character;

        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if (character >= firstCharacter) {
                firstCharacter = character;
                newString += string.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
