package ss25_case_study.controller;

import ss25_case_study.service.customer.CustomerService;
import ss25_case_study.service.customer.ICustomerService;

import java.util.Scanner;

public class CustomerManagement {
    static ICustomerService service = new CustomerService();
    static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;


    public static void customerManagement() {

        checkChoice = false;
        System.out.println("-----CUSTOMER MANAGEMENT-----");
        System.out.println("1.Display list Customers");
        System.out.println("2.Add new Customers");
        System.out.println("3.Edit Customers");
        System.out.println("4.Delete Customers");
        System.out.println("5.Search by name Customers");
        System.out.println("6.Return main menu");
        System.out.print("What do u want bro???? choose ur option: ");
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 6) {
                    System.out.print("invalid number, please input the right number: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("choose the right number please, try again");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    service.displayAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.edit();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    service.searchByName();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
            }
        } while (true);
    }
}

