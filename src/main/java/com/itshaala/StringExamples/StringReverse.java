package com.itshaala.StringExamples;

public class StringReverse {
    public static void main(String[] args) {
        String string = "thread is a block of a code";
        StringBuilder reversed = new StringBuilder(string).reverse();
        System.out.println(reversed);
    }
}
