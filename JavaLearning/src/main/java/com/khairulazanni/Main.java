package com.khairulazanni;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50000, 20);
        System.out.println("Employee's original wage is: " + employee.calculateWage(20));
    }
}
