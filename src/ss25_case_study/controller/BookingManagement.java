package ss25_case_study.controller;

import java.util.Scanner;

public class BookingManagement {
    static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;

    public static void bookingManagement() {
        do {
            checkChoice = false;
            System.out.println("-----BOOKING MANAGEMENT-----");
            System.out.println("1.Add new Booking");
            System.out.println("2.Displaylist Booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display lít contracts");
            System.out.println("5.Edit contracts");
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
        } while (true);
    }
}

