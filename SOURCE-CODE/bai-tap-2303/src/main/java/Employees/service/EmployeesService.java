package Employees.service;

import Employees.entity.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeesService {
    List<Employees> lists = new ArrayList<>();

    public void add(Employees employees) {
        lists.add(employees);
    }

    public void update(int id, Employees employees) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).equals(id)) {
                lists.set(i, employees);
                return;
            }
        }
    }

    public void remove(int id) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).equals(id)) {
                lists.remove(i);
            }
        }
    }
}