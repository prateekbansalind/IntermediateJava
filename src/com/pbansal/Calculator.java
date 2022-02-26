package com.pbansal;

public class Calculator {

    public static void calculator(){
        // Mortgage Calculator
        // Principal : 1000000
        // Annual Interest Rate : 3.92
        // Period (Years) : 30
        // Mortgage : $472.81

        int principal = (int) Console.readNumber("Enter a principal amount: ", 1000, 1000000);
        byte yearlyInterest = (byte) Console.readNumber("Enter a annual interest rate: ", 1, 30);
        byte year = (byte) Console.readNumber("Enter period of year: ", 1, 30);

        // Create calculator object
        var calculator = new MortgageCalculator(principal, year, yearlyInterest);
        // Create report Object
        var report = new MortgageReport(calculator);

        // Calculate mortgage
        report.printMortgage();

        // Calculate payment schedule
        report.printPaymentSchedule();
    }
}
