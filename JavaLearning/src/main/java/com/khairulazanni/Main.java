package com.khairulazanni;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary = 50000;
        employee.hourlyRate = 20;

        int wage = employee.calculateWage(20);
        System.out.println("Employee's wage is: " + wage);
    }
}
