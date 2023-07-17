package ss08_cleancode_reflactoring.excercise.mvc.repository;

import ss08_cleancode_reflactoring.excercise.mvc.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepo {
    ArrayList<Customer> displayAll();

    void add(Customer e);

    void removeCustomer(int id);

    void findByName(String name);
    void sortByCustomerType();
}