package ru.itmo.java.basics.p5;

public class Pr5_5 {
    public void enter() {
        String str = "Sample Output:"+
                "The given string is: This is a test string" +
                "The string reversed word by word is" +
                "sihT si a tset gnirts";
        reverseStr(str);
    }
    public void reverseStr(String str){
        str = str.replace(":","");
        StringBuilder s = new StringBuilder(str);
        StringBuilder w = new StringBuilder();
        str = s.reverse().toString();
        String[] split = str.split("");
        int j = split.length;
        String temp;
        for( int i = 0; i < j/2; i++){
            temp = split[j-i-1];
            split[j-i-1] = split[i];
            split[i] = temp;
        }
        for(String i: split){
            w.append(i).append("");
            System.out.println(w.toString());
        }
    }
}

