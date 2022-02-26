package com.pbansal;

import static com.pbansal.ObjectClass.objectClassDemo;

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

        // Calculator.calculator();

        // object from UI control class
//        var control = new UIControl();
//        control.enable();
//        System.out.println(control.isEnabled);

        // object from textBox class which is also inheriting from UI control class
//        var controlTextBox = new TextBox();
//        controlTextBox.isEnabled();
//        System.out.println(controlTextBox.isEnabled());

        // object class - refer object class file
        // objectClassDemo();

        // Constructor Demo - Using UIControl and Text Box class
//        var textBox = new TextBox();
        // output
        // UIControl
        // TextBox
        // As TextBox inherits from UIControl class, that's why UIControl object initiate first and then TextBox object.




    }
}
