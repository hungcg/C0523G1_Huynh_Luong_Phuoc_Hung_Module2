package ss25_case_study.controller;

import ss25_case_study.service.employee_service.EployeeService;
import ss25_case_study.service.employee_service.IEmpolyeeService;

import java.util.Scanner;

public class EmployeeManagement {
   static IEmpolyeeService service =new EployeeService();
    static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static boolean checkChoice;

    public static
    void employeeManagement() {
        do {
            checkChoice = false;
            System.out.println("-----EMPLOYEE MANAGEMENT-----");
            System.out.println("1.Display list Employee");
            System.out.println("2.Add new Employee");
            System.out.println("3.Edit Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Search by name Employee");
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
                    break;
            }
        } while (true);
    }
}

