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

        // Override introduction
//        var textBox1 = new TextBox();
//        // System.out.println(textBox1.toString()); // no need to explicitly call the toString() method as println method output result in string format.
//        System.out.println(textBox1);

        // upcasting and downcast
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(control);

        // Concept of comparing objects
//        var point1 = new Point(1, 2);
//        var point2 = new Point(1, 2);
//        System.out.println(point1 == point2); // they are comparing the reference address not the value
//        System.out.println(point1.equals(point2));
//
//        // now we override the equals method to compare the values not the reference address.
//        System.out.println(point1.equals(point2)); // true now as we override the equals method.
//
//        // Override hashCode method to get the same value.
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

        // Concept of polymorphism
//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for (var control : controls)
//            control.render();

        // Concept of abstract class
//        UIControl[] controls = {new UIControl(), new TextBox(), new CheckBox()};
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls)
            control.render();
    }

//    public static void show(UIControl control){
//        if (control instanceof TextBox){
//        var textBox = (TextBox) control;
//        textBox.setText("Hello World");}
//        System.out.println(control);
//    }
}


