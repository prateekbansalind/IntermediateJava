package com.pbansal;

public class TextBox extends UIControl{
    // public String text; // Field - This line of code if not assigned with empty value as
    // shown in the below line can cause a error called "NullPointerException" in case of calling
    // string method on this class object and if the declaration of the field is missing.
    private String text = "";

    public TextBox() {
        super(true);  // as this TextBox class doesn't directly have the isEnabled field that's why we used super method which will help out to call the field of parent class.
        System.out.println("TextBox");
    }

    public void setText(String text){
        // text = text;       // this line creates confusion.
        this.text = text;
    }

    public void clear(){
        // this.text = "";    // no need to call "this" here as its evident that we are setting "empty value" to text field of an object.
        text = "";
    }

}
