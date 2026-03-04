package com.khairulazanni.l2_section2;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator mortgageCalculator;
    private final NumberFormat currencyFormat;

    public MortgageReport(int principal, float annualInterest, byte years){
        mortgageCalculator = new MortgageCalculator(principal, annualInterest, years);
        currencyFormat = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + currencyFormat.format(mortgage));
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (double balance : mortgageCalculator.getMortgageBalance()){
            System.out.println(currencyFormat.format(balance));
        }
    }
}
