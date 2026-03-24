package com.itshaala.StringExamples;

public class PalindromeString02 {
    public static void main(String[] args) {
        String string = "madam";
        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println(reversed);
    }
}
