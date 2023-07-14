package ss08_cleancode_reflactoring.excercise.MVC.repository;

import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;

import java.util.Arrays;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private static Customer[] customersList;
    private static int size = 0;

    static {

        customersList = new Customer[10];
        customersList[0] = new Customer(1, "Ironman", 100, "Diamond");
        customersList[1] = new Customer(2, "Captain", 100, "Gold");
        customersList[2] = new Customer(3, "Batman", 100, "Diamond");
        customersList[3] = new Customer(4, "Thor", 100, "Gold");
        customersList[4] = new Customer(5, "Hulk", 100, "Sliver");
        customersList[5] = new Customer(6, "Spiderman", 100, "Sliver");
        size = 6;
    }

    @Override
    public Customer[] displayAll() {
        Customer[] customers = new Customer[size];
        for (int i = 0; i < size; i++) {
            customers[i] = customersList[i];
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList[size] = customer;
        size++;
    }

    @Override
    public Customer[] deleteCustomer(int idDelete) {
        int index = 0;
        for (int i = 0; i < customersList.length - 1; i++) {
            if (customersList[i].getId() == idDelete) {
                index = i;
                break;
            }
        }
        for (int i = index; i < customersList.length - 1; i++) {
            customersList[i] = customersList[i + 1];
            customersList[i + 1] = null;
        }
        return customersList;
    }

    @Override
    public Customer[] searchNameCustomer(String name) {
        Customer[] customersName = new Customer[size];
        boolean flag;
        for (int i = 0; i < size; i++) {
            if (customersList[i].getName().contains(name)) {
                flag = true;
            } else {
                flag = false;
            }
            if (flag == true) {
                customersName[i] = customersList[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (customersName[i] != null) {
                System.out.println(customersName[i]);
            }
        }
        return customersName;
    }
}
