package com.pbansal;

public abstract class UIControl {
    public boolean isEnabled = true;

//    public UIControl() {
//        System.out.println("UIControl");   // traditionally Java developers calls constructor below private field and then below constructor
//                                           // they call all the remaining methods. // main menu > code > generator (shortcut to call constructor)
//    }

//    public UIControl(boolean isEnabled) {
//        System.out.println("UIControl");
//        this.isEnabled = isEnabled;
//    }


    public abstract void render();

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
