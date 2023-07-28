package ss25_case_study.repository.employee_repo;

import ss25_case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeRepo implements IEmployeeRepo {
    public static final String EMPLOYEE_PROFILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss25_case_study\\data\\employeeReadandWrite.csv";
    public static List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static int ramdom() {
        int numrd = 0;
        Random rd = new Random();
        numrd = rd.nextInt(9);
        return numrd;
    }

    public static String numRamdom() {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += (ramdom() + "");
        }
        return result;
    }

    static {
        List<Employee> employees1 = new ArrayList<>();
        employees1 = readFromFile();
        if (employees1.size() == 0) {
            Employee employee1 = new Employee("VNK-" + numRamdom(), "Huấn Rose", "10/10/1995", "male", "206216875", "0935654789", "huanrose@gmail.com", "doctor", "serve", 5000);
            Employee employee2 = new Employee("VNK-" + numRamdom(), "Khá Bảnh", "01/07/1992", "male", "206216875", "0935654789", "ngobakha@gmail.com", "master", "director", 10000);
            Employee employee3 = new Employee("VNK-" + numRamdom(), "Linda", "10/10/1996", "female", "20527875", "0777123654", "linda@gmail.com", "college", "manager", 7000);
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            writeFile();
        }
    }

    private static void writeFile() {
        File customerProfile = new File(EMPLOYEE_PROFILE);
        try {
            FileWriter fileWriter = new FileWriter(customerProfile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee: employees){
                bufferedWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getDayOfBirth() + "," +
                        employee.getGender() + "," + employee.getIdentityCardNumber() + "," + employee.getNumberPhone() + "," +
                        employee.getEmail() + "," + employee.getQuatification() + "," + employee.getPosition() + "," + employee.getSalary());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Employee> readFromFile() {
        List<Employee> employees = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(EMPLOYEE_PROFILE);
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            String temp[];
            Employee employee;
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8],Double.parseDouble(temp[9]));
                employees.add(employee);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void EployeeService() {
        employees = readFromFile();
    }

    @Override
    public void displayAll() {
        if (employees.size() < 1) {
            System.out.println("DATA NOT EXIST, PLEASE INPUT NEW EMPLOYEE: ");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void searchByName() {

    }
    }
