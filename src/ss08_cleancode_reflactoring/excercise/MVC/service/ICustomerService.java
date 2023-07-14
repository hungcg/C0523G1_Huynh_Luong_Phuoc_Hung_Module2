package ss08_cleancode_reflactoring.excercise.MVC.service;

import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;
import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;

public interface ICustomerService {

    Customer[] displayAll();
    void addCustomer(Customer customer);

    Customer[] deleteCustomer(int idDelete);

    Customer[] searchNameCustomer(String name);

}

