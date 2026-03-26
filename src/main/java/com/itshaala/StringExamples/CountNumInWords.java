package com.itshaala.StringExamples;

public class CountNumInWords {
    public static void main(String[] args) {
        String string = "java is hard";
        int count = 1;

        for(int i=0; i<string.length(); i++){
            if (string.charAt(i) == ' ') {

                count++;
            }
        }
        System.out.println(count);
    }
}


//charAt() → method used to get a character at a specific index from a string
//
//👉 Syntax:
//        str.charAt(index)
//
//str → string name
//index → position (starts from 0)
//
//👉 Example:
//        "hello".charAt(1) → e