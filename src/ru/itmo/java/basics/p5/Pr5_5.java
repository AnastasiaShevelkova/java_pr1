package ru.itmo.java.basics.p5;

public class Pr5_5 {
    public void enter() {
        String str = "Sample Output:"+
                "The given string is: This is a test string" +
                "The string reversed word by word is" +
                "sihT si a tset gnirts";
        String stringInvers
                = str;
        System.out.println(reverseString(stringInvers));
        }public static String reverseString(String str) {
        String[] words = str.split(" ");
        String newString = "";
        for (String word : words) {
            newString += new StringBuilder(word).reverse().toString() + " ";
        }
        return newString;
    }}
