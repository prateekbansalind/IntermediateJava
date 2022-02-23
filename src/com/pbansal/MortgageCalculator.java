package com.pbansal;

import java.text.NumberFormat;

public class MortgageCalculator {
    protected final static byte MONTH_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private byte year;
    private float yearlyInterest;

    public MortgageCalculator(int principal, byte year, float yearlyInterest) {
        this.principal = principal;
        this.year = year;
        this.yearlyInterest = yearlyInterest;
    }

    // This method calculates final mortgage.
    public double calculateMortgage(){
        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double mortgage = principal
                * ((monthlyInterest * Math.pow((1+monthlyInterest), numberOfPayments))
                / (Math.pow((1+monthlyInterest), numberOfPayments) - 1));
        return mortgage;
    }

    // Method to calculate remaining principle after 1st monthly installment
    public double calculateBalance(byte noOfPaymentMade){
        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double remainingBalance = (principal
                * (Math.pow((1+monthlyInterest), numberOfPayments) - Math.pow((1+monthlyInterest), noOfPaymentMade))
                / (Math.pow((1+monthlyInterest), numberOfPayments) - 1));
        return remainingBalance;
    }

    public double[] getRemainingBalances(){
        var balances = new double[getNumberOfPayments()];
        for (int month = 1; month <= balances.length; month++)
            balances[month -1] = calculateBalance((byte) month);
           return balances;
        }

    private float getMonthlyInterest() {
        return yearlyInterest / MONTH_IN_YEAR / PERCENT;
    }

    private short getNumberOfPayments() {
        return (short) (year * MONTH_IN_YEAR);
    }

}