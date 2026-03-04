package com.khairulazanni.l2_section2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MortgageCalculator {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    private final int principal;
    private final float annualInterest;
    private final byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double[] getMortgageBalance(){
        var remainingBalance = new double[getNumberOfPayment()];
        for (short month = 1; month <= remainingBalance.length; month++) {
            remainingBalance[month - 1] = calculateBalance(month);
        }
        return remainingBalance;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayment();

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayment();

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public short getYears() {
        return years;
    }

    public short getMonthsInYear() {
        return MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest(){
        return (annualInterest / PERCENT / getMonthsInYear());
    }

    private int getNumberOfPayment(){
        return years * MONTHS_IN_YEAR;
    }
}
