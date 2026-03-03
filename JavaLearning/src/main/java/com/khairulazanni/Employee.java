package com.khairulazanni;

public class Employee {
    private int baseSalary;


    private int hourlyRate;

    private void checkValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
    }

    public void setBaseSalary(int baseSalary){
        checkValue(baseSalary);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
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
