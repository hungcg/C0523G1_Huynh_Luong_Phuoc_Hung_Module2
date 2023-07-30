package ss25_case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;


    public static void displayMainMenu() {
        do {
            checkChoice = false;
            System.out.println("FURAMA RESORT MANAGEMENT SYSTEM");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("choose the right number please, try again");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    EmployeeManagement.employeeManagement();
                    break;
                case 2:
                    CustomerManagement.customerManagement();
                    break;
                case 3:
                    FacilityManagement.facilityManagement();
                    break;
                case 4:
                    BookingManagement.bookingManagement();
                    break;
                case 5:
                    PromotionManagement.promotionManagement();
                    break;
                case 6:
                    System.exit(0);

            }


        } while (checkChoice);
    }
}

