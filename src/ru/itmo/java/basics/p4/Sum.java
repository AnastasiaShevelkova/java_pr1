package ru.itmo.java.basics.p4;

import java.util.Scanner;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean i;
        if (a+b==c){
            i=true;
        }
        else{
            i=false;
        }
        System.out.println(i);
    }
}
