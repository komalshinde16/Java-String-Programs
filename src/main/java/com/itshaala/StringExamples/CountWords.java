package com.itshaala.StringExamples;

public class CountWords {
    public static void main(String[] args) {
        String string = "learning basic examples of string!";
        int count = 0;

        for(int i=0; i<string.length();i++){
            if(string.charAt(i)==' '){
                count ++;

            }
        }
        System.out.println(count);
    }
}
