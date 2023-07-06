package ss02_loop_java.exercise;

import java.util.Scanner;

public class HienThiCacSoNguyenToBeHon100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị bao nhiêu số nguyên tố bé hơn 100 ? ");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        int count = 0;
        for (int n = 2; count < numbers && n < 100; n++) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
        }
    }
}

