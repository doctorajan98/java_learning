package com.khairulazanni.l2_section2;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator mortgageCalculator;

    public MortgageReport(int principal, float annualInterest, byte years){
        mortgageCalculator = new MortgageCalculator(principal, annualInterest, years);
    }

    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= mortgageCalculator.getYears() * mortgageCalculator.getMonthsInYear(); month++) {
            double balance = mortgageCalculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
