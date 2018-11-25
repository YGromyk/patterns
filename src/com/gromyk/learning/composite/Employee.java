package com.gromyk.learning.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    String departament;
    double salary;
    private List<Employee> subordinates;

    public Employee(String name, String departament, double salary) {
        this.salary = salary;
        this.name = name;
        this.departament = departament;
        subordinates = new ArrayList<>();
    }

    public void add(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public void remove(Employee subordinate) {
        subordinates.remove(subordinate);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + departament + ", salary :" + salary + " ]");
    }
}
