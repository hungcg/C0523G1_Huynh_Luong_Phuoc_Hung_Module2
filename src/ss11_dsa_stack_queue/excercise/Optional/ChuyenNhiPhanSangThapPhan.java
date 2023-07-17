package ss11_dsa_stack_queue.excercise.Optional;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenNhiPhanSangThapPhan {

    public static void main(String[] args) {
        Stack<Integer> binaryNumber = new Stack<>();
        String binaryString = "";
        int binary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the number change to binary");
        int number = scanner.nextInt();
        do {
            binary = number % 2;
            number /= 2;
            binaryNumber.push(binary);
        } while (number != 0);
        while (!binaryNumber.isEmpty()) {
            binaryString += binaryNumber.pop();
        }
        System.out.println(binaryString);
    }
}
