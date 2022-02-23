package com.pbansal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // initiateTextBoxObject();
        // proceduralProgramming();


        // Below code is an example to demonstrate the object creation of employee class
//        var employee = new EmployeeClass(50_000);
//        int wage = employee.calculateWage();
//        System.out.println(wage);
//        printNoOfEmployees();


        // to reduce coupling, we introduce another class Browser.
        // the purpose of abstraction is to reduce the complexity to hide the unnecessary details.
        //var browser = new Browser();
        //browser.Navigate("www.codeeasy.com");

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
