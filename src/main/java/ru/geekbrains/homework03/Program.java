package ru.geekbrains.homework03;

import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        System.out.println();
        List<Employee> workers = Worker.getEmployees(5);

        System.out.println("=".repeat(50) + "Список рабочих с сортировкой по фамилии" + "=".repeat(50));
        Collections.sort(workers, new EmployeeNameComparator());
        for (Employee worker: workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("=".repeat(50) + "Список фрилансеров с сортировкой по возрасту" + "=".repeat(50));

        List<Employee> freelancers = Freelancer.getEmployees(5);

        Collections.sort(freelancers, new EmployeeAgeComparator());

        for (Employee freelancer: freelancers) {
            System.out.println(freelancer);
        }

        System.out.println();
        System.out.println("=".repeat(50) + "Список всех сотрудников" + "=".repeat(50));

        ListOfEmployees allEmployees = new ListOfEmployees();

        for (Employee worker: workers) {
            allEmployees.add(worker);
        }
        for (Employee worker: freelancers) {
            allEmployees.add(worker);
        }

        for (Employee employee: allEmployees) {
            System.out.println(employee);
        }
    }
}
