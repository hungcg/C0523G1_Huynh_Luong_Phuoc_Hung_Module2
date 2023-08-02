package ss25_case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;


    public static void displayMainMenu() {

        System.out.println("FURAMA RESORT MANAGEMENT SYSTEM");
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
        System.out.print("What do u want bro???? choose ur option: ");
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 6) {
                    System.out.print("invalid number, please input the right number: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("choose the right number please, try again: ");
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
        } while (true);
    }
}

