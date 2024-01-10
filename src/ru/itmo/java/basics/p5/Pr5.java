package ru.itmo.java.basics.p5;

import java.util.Arrays;

public class Pr5 {
    public void enter() {
        String text =
                "Аутологические или самозначные слова — это слова," +
                        "которые описывают сами себя. ";
        longestWord(text);
    }
    public void longestWord(String n){
        String[] split = n.split(" ");
        System.out.println(Arrays.toString(split));
        int max = 0;
        String g = "";
        for(int i = 0; i<split.length;i++){
            if (split[i].length()>max) {
                max = split[i].length();
                g = split[i];
            }
        }
        System.out.println("Слово: "+g+ " Кол-во символов:"+max);

    }
}
