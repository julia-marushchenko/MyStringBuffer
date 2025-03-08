// Java program to demonstrate appendCodePoint() method of StringBuffer
package com.stringbuffer.method;

// Class Main
public class Main {

    // Main driver method
    public static void main(String[] args) {

        // Creating StringBuffer object with value String
        StringBuffer sb = new StringBuffer("String");

        // Printing sb value to console
        System.out.println(sb); // Printed value is String

        // Adding to sb value of Ascii table with code 54
        sb.appendCodePoint(54);

        // Printing new sb value to console
        System.out.println(sb); // Printed value is String6, because 54 is code of 6

        // Adding to sb value of Ascii table with code 65
        sb.appendCodePoint(65);

        // Printing new sb value to console
        System.out.println(sb); // Printed value is String6A, because 65 is code of A

        // Adding to sb value of Ascii table with code 65
        sb.appendCodePoint(66);

        // Printing new sb value to console
        System.out.println(sb); // Printed value is String6AB, because 66 is code of B
        
    }
}