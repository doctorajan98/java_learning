package com.khairulazanni;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private void checkValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
    }

    private void setBaseSalary(int baseSalary){
        checkValue(baseSalary);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        checkValue(hourlyRate);
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
