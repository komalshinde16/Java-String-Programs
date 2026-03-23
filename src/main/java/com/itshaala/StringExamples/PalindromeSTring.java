package com.itshaala.StringExamples;

public class PalindromeSTring {
    public static void main(String[] args) {
        String string = "Radar";
        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println(reversed);
    }
}
