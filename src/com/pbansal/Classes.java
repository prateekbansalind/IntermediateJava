package com.pbansal;

// Creating object
public class Classes {
    public static void initiateTextBoxObject(){
        var textBox1 = new TextBox();
        textBox1.setText("Prateek");
        // System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Bansal");
        // System.out.println(textBox2.text.toUpperCase());

        // memory allocation
        var textbox3 = new TextBox();
        textbox3 = textBox2;
        // System.out.println(textbox3.text);
        // this above code explains that the variable textBox3 doesn't contain the
        // actual value of the object but the address its referred from.
    }


}
