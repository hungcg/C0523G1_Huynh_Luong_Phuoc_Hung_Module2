package ss25_case_study.service.customer;

import ss25_case_study.model.person.Customer;
import ss25_case_study.repository.customer.CustomerRepo;
import ss25_case_study.repository.customer.ICustomerRepo;
import ss25_case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);

    ICustomerRepo repository = new CustomerRepo();

    public static String[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input guest birthday");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input guest gender");
        String gender = scanner.nextLine();
        System.out.println("Input guest Indentify number");
        String indentify;
        do {
            System.out.println("Input guest Indentify number");
            indentify = scanner.nextLine();
        } while (Regex.indentifyCheck(indentify));
        System.out.println("Input guest phone number");
        String phoneNumber;
        do {
            System.out.println("Input guest phone number");
            phoneNumber = scanner.nextLine();
        } while (Regex.indentifyCheck(phoneNumber));
        System.out.println("Input guest email");
        String email = scanner.nextLine();
        System.out.println("Input guest type");
        String customerType = scanner.nextLine();
        System.out.println("Input guest address");
        String address = scanner.nextLine();
        String[] inputList = {name, dateOfBirth, gender, indentify, phoneNumber, email, customerType, address};
        return inputList;
    }

    @Override
    public void displayAll() {
        List<Customer> customerList = repository.displayAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        String id = "";
        do {
            System.out.println("Input new id");
            id = scanner.nextLine();
        } while (Regex.customerIdCheck(id));
        if (repository.checkId(id) != -1) {
            System.out.println("Id exist,please input another id");
        }
        String[] array = input();
        Customer customer = new Customer(id, array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
        repository.add(customer);
    }

    @Override
    public void edit() {
        String id = "";
        do {
            System.out.println("Input id you wanna edit");
            id = scanner.nextLine();
        } while (Regex.customerIdCheck(id));
        if (repository.checkId(id) == -2) {
            System.out.println("Id exist,please input another id");
            return;
        }
        System.out.println("input new customer inforation");
        String[] array = input();
        Customer customer = new Customer(id, array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
        repository.edit(id, customer);
    }

    @Override
    public void delete() {
        String id = "";
        do {
            System.out.println("Input id u wanna xóa");
            id = scanner.nextLine();
        } while (Regex.customerIdCheck(id));
        if (repository.checkId(id) == -8) {
            System.out.println(" this id never exist,please input another id");
            return;
        }
        repository.delete(id
        );
    }

    @Override
    public void searchByName() {
        System.out.println("Input name you wanna sợt");
        String name = scanner.nextLine();
        List<Customer> customers = repository.searchByName(name);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers);
        }
    }
}
