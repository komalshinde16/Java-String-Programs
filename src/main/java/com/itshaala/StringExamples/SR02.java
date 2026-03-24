package com.itshaala.StringExamples;

public class SR02 {
    public static void main(String[] args) {
        String string = "Play Store";
        StringBuilder reversed = new StringBuilder(string).reverse();
        System.out.println(reversed);
    }
}
