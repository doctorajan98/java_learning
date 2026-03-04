package com.khairulazanni;

import com.khairulazanni.l2_section2.Mortgage;
import com.khairulazanni.l2_section2.ReadInput;

public class Main {
    public static void main(String[] args) {
        var readInput = new ReadInput();

        int principal = (int) readInput.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readInput.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readInput.readNumber("Period (Years): ", 1, 30);

        var mortgage = new Mortgage(principal, annualInterest, years);
        mortgage.printMortgage();
        mortgage.printPaymentSchedule();
    }
}
