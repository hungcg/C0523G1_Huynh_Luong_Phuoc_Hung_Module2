package ss01_introduce_java.exercise;

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        double usd;
        double vnd = 23000;
        Scanner money = new Scanner(System.in);
        System.out.println("nhập số tiền USD bạn muốn quy đổi");
        usd = money.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Số tiền sau khi quy đổi là : " + quydoi + " VND");
    }
}
