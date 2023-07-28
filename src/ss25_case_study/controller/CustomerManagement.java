package ss25_case_study.controller;

import java.util.Scanner;

public class CustomerManagement {
    static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;


    public static void customerManagement() {
        do {

            checkChoice = false;
            System.out.println("1.Display list Customers");
            System.out.println("2.Add new Customers");
            System.out.println("3.Edit Customers");
            System.out.println("4.Delete Customers");
            System.out.println("5.Search by name Customers");
            System.out.println("6.Return main menu");
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    FuramaController.displayMainMenu();
            }
        } while (checkChoice);
    }
}

