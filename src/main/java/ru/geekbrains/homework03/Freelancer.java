package ru.geekbrains.homework03;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee{


    private Freelancer(String surName, String name, int age, double salary){
        super(surName, name, age, salary);
    }

    public static Employee getInstance(){
        return new Freelancer(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                random.nextInt(20, 65),
                20.8 * 8 * random.nextInt(500, 5000));
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
        return String.format("%s %s (Возраст: %d); Фрилансер; Среднемесячная заработная плата (почасовая оплата труда): %.2f (руб.)",
                surName, name, age, salary);
    }
}
