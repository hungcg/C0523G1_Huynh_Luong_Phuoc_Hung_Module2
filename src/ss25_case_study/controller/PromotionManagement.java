package ss25_case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;

    public static void promotionManagement() {
        do {
            checkChoice = false;
            System.out.println("1.Display list Customer use service");
            System.out.println("2.Display list Customer get voucher");
            System.out.println("3.Edit Employee");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("choose the right number please, try again");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
            }
        } while (checkChoice);
    }
}

