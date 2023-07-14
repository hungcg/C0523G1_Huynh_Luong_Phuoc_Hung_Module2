package ss08_cleancode_reflactoring.excercise.MVC.repository;

import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;
import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;

public interface ICustomerRepository {
    Customer[] displayAll();
    void addCustomer(Customer customer);

    Customer[] deleteCustomer(int idDelete);

    Customer[] searchNameCustomer(String name);
}
