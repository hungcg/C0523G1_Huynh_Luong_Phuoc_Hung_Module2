package ss08_cleancode_reflactoring.excercise.mvc.controller;

import ss08_cleancode_reflactoring.excercise.mvc.service.CustomerService;
import ss08_cleancode_reflactoring.excercise.mvc.service.ICustomerService;
import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerService();
    private static int number = 0;

    public static void main(String[] args) {
        do {
            System.out.println("-----LIST-----");
            System.out.println("1.Display all");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Search");
            System.out.println("5.Sort by Customer Type");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    service.displayAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.removeCustomer();
                    break;
                case 4:
                    service.findByName();
                    break;
                case 5:
                    service.sortByCustomerType();
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
