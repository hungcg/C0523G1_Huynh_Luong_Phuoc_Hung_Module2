package ss08_cleancode_reflactoring.excercise.mvc.service;

import ss08_cleancode_reflactoring.excercise.mvc.model.Customer;

import java.util.Comparator;

public class SortByCustomerType implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getTypeCustomer().compareTo(o2.getTypeCustomer());
    }
}
