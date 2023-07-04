package ss01_introduce_java.exercise;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter your number");
        int number = read.nextInt();

        do {
            if (number <= 0 || number > 261) {
                System.out.println("the number must >0 and >=261 pls reset and enter again");
                break;
            }
        } while (number <= 0 || number > 261);

        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;


        }


    }
}

