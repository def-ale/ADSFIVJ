package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.print("Id already taken! Try another id: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            employees.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();


        Employee emp = employees.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        // Integer pos = position(employees, idsalary);

        if (emp != null) {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }
        else
            System.out.println("This id does not exist!");

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> employees, Integer id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> employees, int id) {
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}