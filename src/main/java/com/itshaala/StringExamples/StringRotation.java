package com.itshaala.StringExamples;

public class StringRotation {
    public static void main(String[] args) {
        String string1 = "abcde";
        String string2 = "dddd";

        if(string1.length() == string2.length() && (string1 + string1).contains(string2)){
            System.out.println("rotation");
        }else{
            System.out.println("not rotation");
        }
    }
}


//We do string1 + string1 ( string1 + string1)
//Reason: to cover all possible rotations
//
//👉 Example:
//string1 = "abcde"
//
//Rotations: bcdea, cdeab, deabc, eabcd