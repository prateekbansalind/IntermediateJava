package com.pbansal;

public class TaxReport {

    private TaxCalculator2018 calculator;

    public TaxReport(){
        this.calculator = new TaxCalculator2018(100_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // here in this class, we can see that this class TaxReport is tightly coupled with taxCalculator.
}
