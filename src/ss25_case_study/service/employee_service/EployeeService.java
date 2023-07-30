package ss25_case_study.service.employee_service;

import ss25_case_study.model.person.Employee;
import ss25_case_study.repository.employee_repo.EmployeeRepo;
import ss25_case_study.repository.employee_repo.IEmployeeRepo;
import ss25_case_study.utils.Regex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EployeeService implements IEmpolyeeService {
    IEmployeeRepo repository = new EmployeeRepo();

    public static String[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input ur birthday:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input ur gender:");
        String gender = scanner.nextLine();
        System.out.println("Input ur Identify number:");
        String identify = Regex.indentifyCheck();
        System.out.println("Input ur phone number:");
        String phoneNumber = Regex.phoneNumberCheck();
        System.out.println("Input ur email:");
        String email = scanner.nextLine();
        System.out.println("Input ur quatification:");
        String quatification = scanner.nextLine();
        System.out.println("Input ur position:");
        String position = scanner.nextLine();
        System.out.println("Input ur salary:");
        Double salary;
        do {
            salary = Double.parseDouble(scanner.nextLine());
            if (salary <= 0) {
                System.out.println("Salary must be >0,try again");
            }
        } while (salary <= 0);
        String[] inforList = {name, dateOfBirth, gender, identify, phoneNumber, email, quatification, position, String.valueOf(salary)};
        return inforList;
    }

    @Override
    public void displayAll() {
        List<Employee> employeeList = repository.displayAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }


    @Override
    public void add() {
        System.out.println("Input new id:");
        String id = Regex.idCheck();
        if (repository.checkId(id) != -1) {
            System.out.println("Id exist,please input another id");
        }
        String[] arr = input();
        Employee employee = new Employee(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Double.parseDouble(arr[8]));
        repository.add(employee);
    }


    @Override
    public void edit() {
        System.out.println("Input ID you wanna edit:");
        String chooseId = Regex.idCheck();
        if (repository.checkId(chooseId) == -9) {
            System.out.println("Id exist,please input another id");
            return;
        }
        System.out.println("input new employee information:");
        String[] arr = input();
        Employee employee = new Employee(chooseId, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Double.parseDouble(arr[8]));
        repository.edit(chooseId, employee);

    }

    @Override
    public void delete() {
        System.out.println("Input ID you wanna delete:");
        String id = Regex.idCheck();
        if (repository.checkId(id) == -8) {
            System.out.println(" this id never exist,please input another id");
            return;
        }
        repository.delete(id);
    }

    @Override
    public void searchByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = scanner.nextLine();
        List<Employee> employees = repository.searchByName(name);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

