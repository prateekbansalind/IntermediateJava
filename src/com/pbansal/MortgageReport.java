package com.pbansal;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
        }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String formattedMortgage = currency.format(mortgage);
        System.out.println("\nMORTGAGE :" + formattedMortgage);
        System.out.println("------");
    }
}
