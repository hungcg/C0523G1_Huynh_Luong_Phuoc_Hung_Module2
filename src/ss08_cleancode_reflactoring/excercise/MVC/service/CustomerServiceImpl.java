package ss08_cleancode_reflactoring.excercise.MVC.service;

import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;
import ss08_cleancode_reflactoring.excercise.MVC.model.Customer;
import ss08_cleancode_reflactoring.excercise.MVC.repository.CustomerRepositoryImpl;
import ss08_cleancode_reflactoring.excercise.MVC.repository.ICustomerRepository;
import ss08_cleancode_reflactoring.excercise.MVC.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepositoryImpl();

    @Override
    public Customer[] displayAll() {
        return repository.displayAll();
    }

//    @Override
//    public Customer[] displayAllS() {
//        return repository.displayAll();
//    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public Customer[] deleteCustomer(int idDelete) {
        return repository.deleteCustomer(idDelete);
    }

    @Override
    public Customer[] searchNameCustomer(String name) {
        return repository.searchNameCustomer(name);
    }
}
