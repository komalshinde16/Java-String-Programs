package com.itshaala.StringExamples;

public class RemoveSpaces {
    public static void main(String[] args) {
        String string = "java is a high level programming language";

        String result = string.replaceAll("\\s", "");

        System.out.println(result);
    }
}



//str.replaceAll("\\s", "") → removes all whitespace
//str.replace(" ", "") → removes only spaces
//
//✔ So, use "\\s" only when you need regex (all whitespace).