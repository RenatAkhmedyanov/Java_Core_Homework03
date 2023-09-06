package ru.geekbrains.homework03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfEmployees  implements Iterable<Employee> {

    private List<Employee> employees;

    public ListOfEmployees() {
        employees = new ArrayList<>();
    }

    public void add(Employee employee){
        employees.add(employee);
    }
    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}
