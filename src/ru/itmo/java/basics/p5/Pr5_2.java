package ru.itmo.java.basics.p5;

public class Pr5_2 {
    public void enter() {
        StringBuilder word = new StringBuilder("Шалаш");
        palindrom(word);}
    public void palindrom(StringBuilder word){
        String w = word.toString();
        String n = word.reverse().toString();
        System.out.println(w);
        System.out.println(n);
        if(w.equalsIgnoreCase(n)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }


        }
}