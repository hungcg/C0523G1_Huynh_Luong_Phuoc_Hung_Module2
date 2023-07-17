package ss08_cleancode_reflactoring.excercise.mvc.repository;

import ss08_cleancode_reflactoring.excercise.mvc.model.Customer;
import ss08_cleancode_reflactoring.excercise.mvc.service.SortByCustomerType;

import java.util.ArrayList;
import java.util.Collections;


public class CustomerRepo implements ICustomerRepo {
    private static ArrayList<Customer> myCustomer = new ArrayList<>(10);

    static {
        myCustomer.add(new Customer(1, "Ironman", 30, "Diamond"));
        myCustomer.add(new Customer(2, "Batman", 30, "Gold"));
        myCustomer.add(new Customer(3, "Superman", 30, "Silver"));
    }

    @Override
    public ArrayList<Customer> displayAll() {
        Collections.sort(myCustomer);
        return myCustomer;
    }

    @Override
    public void add(Customer e) {
        myCustomer.add(e);
    }

    @Override
    public void removeCustomer(int id) {
        for (int i = 0; i < myCustomer.size(); i++) {
            if (myCustomer.get(i).getId() == id) {
                myCustomer.remove(i);
                break;
            }
        }
    }

    @Override
    public void findByName(String name) {
        for (int i = 0; i < myCustomer.size(); i++) {
            if (myCustomer.get(i).getName().contains(name)) {
                System.out.println(myCustomer.get(i));
            }
        }
    }

    @Override
    public void sortByCustomerType() {
        SortByCustomerType sortByCustomerType = new SortByCustomerType();
        Collections.sort(myCustomer, sortByCustomerType);
    }
}
