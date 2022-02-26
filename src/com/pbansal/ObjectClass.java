package com.pbansal;

import java.rmi.server.RemoteObjectInvocationHandler;

public class ObjectClass {
    public static void objectClassDemo(){
        var text1 = new Object();
        var text2= text1;
        System.out.println(text1.hashCode());  // 1239731077
        System.out.println(text2.hashCode());  // 1239731077
        System.out.println(text1.equals(text2)); // true

       // another scenario
        var text3 = new Object(); // Belongs to java.lang package.
        var text4 = new Object();
        System.out.println(text3.hashCode());  // 557041912
        System.out.println(text4.hashCode());  // 1134712904
        System.out.println(text3.equals(text4)); // false

        // another scenario
        var text5 = new Object();
        System.out.println(text5.toString());
        // java.lang.Object@3ac3fd8b
        // The above comment shows the output of toString() method.
        // in that output "java.lang.Object@3ac3fd8b", "java.lang" is a package name
        // and ".Object" is a subpackage of "java.lang" and then "@3ac3fd8b"
        // @3ac3fd8b after @ is a hashcode address of an object in a hexadecimal format.
    }
}
