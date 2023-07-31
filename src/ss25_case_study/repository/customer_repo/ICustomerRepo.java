package ss25_case_study.repository.customer_repo;

import ss25_case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepo  {
    int checkId(String id);
   List<Customer> displayAll();
    void add(Customer customer);
    void edit(String id, Customer customer);
    void delete(String id);
    List<Customer> searchByName(String name);
}
