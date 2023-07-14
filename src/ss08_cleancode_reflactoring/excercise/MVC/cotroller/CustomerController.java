package ss08_cleancode_reflactoring.excercise.MVC.cotroller;

import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;
import ss08_cleancode_reflactoring.excercise.MVC.service.CustomerServiceImpl;
import ss08_cleancode_reflactoring.excercise.MVC.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select ;

        do {
            System.out.println("___Student Management___");
            System.out.println("1.List");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Search");
            System.out.println("9.Exit");
            System.out.println("Choose your option: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1://display
                    Customer[] customerList = service.displayAll();
                    for(Customer customer : customerList){
                        System.out.println(customer);
                    }
                    break;
                case 2://add
                    System.out.println("Input id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    System.out.println("Input age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input type customer:");
                    String typeCustomer = scanner.nextLine();
                    Customer customer = new Customer(id,name,age,typeCustomer);
                    service.addCustomer(customer);
                    break;
                case 3://delete
                    System.out.println("Input id");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    service.deleteCustomer(idDelete);
                case 4://search
                    System.out.println("Input name");
                    String names = scanner.nextLine();
                    service.searchNameCustomer(names);
                case 9://exit
                    System.exit(0);
            }
        }while (true);
    }
}
