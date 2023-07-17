package ss08_cleancode_reflactoring.excercise.mvc.service;

public interface ICustomerService {
    void displayAll();

    void add();

    void removeCustomer();

    void findByName();
    void sortByCustomerType();
}