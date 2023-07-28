package ss25_case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;


    public static void facilityManagement() {
        do {

            checkChoice = false;
            System.out.println("1.Display list Facility");
            System.out.println("2.Add new Facility");
            System.out.println("3.Display list Facility maintenance");
            System.out.println("4.Delete Facility");
            System.out.println("5.Return main menu");
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
                    FuramaController.displayMainMenu();
            }
        } while (checkChoice);
    }
}

