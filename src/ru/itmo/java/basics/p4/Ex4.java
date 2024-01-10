package ru.itmo.java.basics.p4;

import java.util.Scanner;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean res = ((b > a) && (c > b));
        System.out.println(res);
        }
}
