package ru.geekbrains.homework03;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee{

    private Worker(String surName, String name, int age, double salary){
        super(surName, name, age, salary);
    }

    public static Employee getInstance(){
        return new Worker(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                random.nextInt(20, 65),
                random.nextInt(30000, 250000));
    }

    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Возраст: %d); Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surName, name, age, salary);
    }
}
