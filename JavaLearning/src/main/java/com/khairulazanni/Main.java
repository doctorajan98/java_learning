package com.khairulazanni;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(6600);
        employee.setHourlyRate(10);

        int wage = employee.calculateWage(20);
        System.out.println("Employee's wage is: " + wage);
    }
}
