package ss25_case_study.repository.employee_repo;

import ss25_case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepo  {

    int checkId(String id);
    List<Employee> displayAll();
    void add(Employee employee);
    void edit(String id,Employee employee);
    void delete(String id);
    List<Employee> searchByName(String name);
}
