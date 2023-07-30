package ss25_case_study.repository.employee_repo;

import ss25_case_study.model.person.Employee;
import ss25_case_study.utils.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeRepo implements IEmployeeRepo {
    public static final String EMPLOYEE_PROFILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss25_case_study\\data\\employeeReadandWrite.csv";


    @Override
    public int checkId(String id) {
        List<Employee> employeeList = displayAll();
        int index = -1;
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                index = employeeList.indexOf(employee);
            }
        }
        return index;
    }


    @Override
    public List<Employee> displayAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFromFile(EMPLOYEE_PROFILE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;

    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoCSV());
        ReadAndWriteFile.writeFromFile(EMPLOYEE_PROFILE, stringList, true);

    }


    @Override
    public void edit(String id, Employee employee) {
        int index = checkId(id);
        List<Employee> employeeList = displayAll();
        employeeList.set(index, employee);
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWriteFile.writeFromFile(EMPLOYEE_PROFILE, stringList, false);

    }

    @Override
    public void delete(String id) {
        int index = checkId(id);
        List<Employee> employeeList = displayAll();
        employeeList.remove(index);
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWriteFile.writeFromFile(EMPLOYEE_PROFILE, stringList, false);

    }

    @Override
    public List<Employee> searchByName(String name) {
        List<Employee> employeeList = displayAll();
        List<Employee> employee = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().contains(name)) {
                employee.add(employeeList.get(i));
            }
        }
        return employee;
    }
}
