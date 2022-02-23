package com.pbansal;

public class EmployeeClass {
    private int baseSalary;
    private int hourlyRate;
    public static int noOfEmployees;

    public EmployeeClass(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        noOfEmployees++;
    }

    // below constructor is useful if an employee not working extra hours.
//    public EmployeeClass(int salary){
//        setSalary(salary);
//        setHourlyRate(0);
//    }

    public EmployeeClass(int baseSalary){
        this(baseSalary, 0);
    }

    public static void printNoOfEmployees(){
        System.out.println(noOfEmployees);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    // setBaseSalary
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("base salary cannot be zero and below zero.");
        this.baseSalary = baseSalary;
    }

    // getBaseSalary
    private int getBaseSalary(){
        return this.baseSalary;
    }

    // setHourlyRate
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("hourly rate cannot be zero or negative.");
        this.hourlyRate = hourlyRate;
    }

    // getHourlyRate
    private int getHourlyRate(){
        return this.hourlyRate;
    }


}
