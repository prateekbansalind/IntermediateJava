package com.pbansal;

import static com.pbansal.Classes.initiateTextBoxObject;
import static com.pbansal.EmployeeClass.*;
import static com.pbansal.ProceduralProgramming.proceduralProgramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // initiateTextBoxObject();
        // proceduralProgramming();


        // Below code is an example to demonstrate the object creation of employee class
        var employee = new EmployeeClass(50_000);
        int wage = employee.calculateWage();
        System.out.println(wage);
        printNoOfEmployees();


        // to reduce coupling, we introduce another class Browser.
        // the purpose of abstraction is to reduce the complexity to hide the unnecessary details.
        //var browser = new Browser();
        //browser.Navigate("www.codeeasy.com");


    }
}
