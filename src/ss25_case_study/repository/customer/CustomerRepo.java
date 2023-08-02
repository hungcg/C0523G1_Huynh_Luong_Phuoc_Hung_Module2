package ss25_case_study.repository.customer;

import ss25_case_study.model.person.Customer;
import ss25_case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {

    public static final String CUSTOMER_PROFILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss25_case_study\\data\\customerReadAndWrite";


    @Override
    public int checkId(String id) {
        List<Customer> customerList = displayAll();
        int index = -1;
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                index = customerList.indexOf(customer);
            }
        }
        return index;
    }

    @Override
    public List<Customer> displayAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFromFile(CUSTOMER_PROFILE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }


    @Override
    public void add(Customer customer) {
        List<String> stringList =new ArrayList<>();
        stringList.add(customer.getInfoCSV());
        ReadAndWriteFile.writeFromFile(CUSTOMER_PROFILE,stringList,true);

    }

    @Override
    public void edit(String id,Customer customer) {
        int index =checkId(id);
        List<Customer> customerList = displayAll();
        customerList.set(index,customer);
        List<String> stringList =new ArrayList<>();
        for (Customer e: customerList ) {
            stringList.add(e.getInfoCSV());
        }
ReadAndWriteFile.writeFromFile(CUSTOMER_PROFILE,stringList,false);
    }

    @Override
    public void delete(String id) {
        List<Customer> customerList =displayAll();
        int index =checkId(id);
        customerList.remove(index);
        List<String> stringList =new ArrayList<>();
        for (int i = 0; i <customerList.size() ; i++) {
            stringList.add(customerList.get(i).getInfoCSV());
        }
        ReadAndWriteFile.writeFromFile(CUSTOMER_PROFILE,stringList,false);

    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer> customerList = displayAll();
        List<Customer> employee = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(name)) {
                employee.add(customerList.get(i));
            }
        }
        return employee;

    }
}
