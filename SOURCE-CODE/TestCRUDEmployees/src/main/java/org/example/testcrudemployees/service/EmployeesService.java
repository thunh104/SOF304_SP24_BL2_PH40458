package org.example.testcrudemployees.service;

import com.sun.jdi.request.DuplicateRequestException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.example.testcrudemployees.entities.Employees;
import org.example.testcrudemployees.model.EmployeesRequest;
import java.util.ArrayList;
import java.util.List;

public class EmployeesService {

    private final List<Employees> employeesList;

    public EmployeesService() {
        this.employeesList = new ArrayList<>();
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void addEmployees(Employees employees) {

        checkDuplicate(employees);

        if (employees != null) {
            employeesList.add(employees);
            System.out.println("Add success");
        } else {
            System.out.println("Employees is not null");
            System.out.println("add false");
            throw new NullPointerException("Employees not null");
        }

    }

    private void checkDuplicate(Employees employees) {
        for (Employees oldEmployees : employeesList){
            if (employees.getId() == oldEmployees.getId()){
                System.out.println("duplicate id");
                throw new DuplicateRequestException("duplicate id");
            }
        }
    }

    public void updateEmployees(int id, EmployeesRequest newEmployees) {

        for (Employees employees : employeesList) {
            if (employees.getId() == id) {
                employees.setEmail(newEmployees.getEmail());
                employees.setFirstName(newEmployees.getFirstName());
                employees.setLastName(newEmployees.getFirstName());
                employeesList.add(employees);
                System.out.println("update success");
                return;
            } else {
                System.out.println("code is not valid!");
                System.out.println("update false");
                throw new NullArgumentException();
            }
        }

    }

    public void deleteEmployees(Long id) {

        if(id == null){
            System.out.println("id not be null");
            throw new ArithmeticException("id not be null");
        }

        for (Employees employees : employeesList) {
            if (employees.getId() == id ) {
                employeesList.remove(employees);
                System.out.println("delete success");
                return;
            } else {
                System.out.println("code is not valid!");
                System.out.println("update false");
                throw new ArithmeticException();
            }
        }
    }

}
