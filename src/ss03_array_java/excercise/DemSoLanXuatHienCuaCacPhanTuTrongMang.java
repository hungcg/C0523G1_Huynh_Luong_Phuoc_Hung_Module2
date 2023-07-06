package ss03_array_java.excercise;

import java.util.Scanner;

public class DemSoLanXuatHienCuaCacPhanTuTrongMang {
    public static void main(String[] args) {
        String string = "abaaaaaacxyz";
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol) {
                count++;
            }
        }
        System.out.println(count);
    }
}
