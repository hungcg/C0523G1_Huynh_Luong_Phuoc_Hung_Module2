package ss01_introduce_java.exercise;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner greeting = new Scanner(System.in);
        System.out.println("Nhập vào tên bạn");
        String say = greeting.nextLine();
        System.out.println("Nice to meet you : " + say);
    }
}
