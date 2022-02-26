package com.pbansal;

public final class TextBox extends UIControl{
    // public String text; // Field - This line of code if not assigned with empty value as
    // shown in the below line can cause a error called "NullPointerException" in case of calling
    // string method on this class object and if the declaration of the field is missing.
    private String text = "";

//    public TextBox() {
//        super(true);  // as this TextBox class doesn't directly have the isEnabled field that's why we used super method which will help out to call the field of parent class.
//        System.out.println("TextBox");
//    }

    // overriding method introduction
//    @Override
//    public String toString(){
//        return "Hello World";
//    }

    @Override
    public void render(){
        System.out.println("Render TextBox");
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

// public class MyTextBox extends TextBox{
    // The MyTextBox class cannot be inherited from the TextBox class as the TextBox class is declared with final keyword.
    // final keyword basically prevents any class to be further extended to implemented to a child class.
    // this is not as widely used as it prevents some important concepts of OOPS like polymorphism and inheritance.
    // Whereas this String class is declared with final keyword as it cannot be implemented to any child class
    // This is made with the assumption that any method in the string class like upperClass should create another instance of string object
    // as they are immutable in nature.
// }
