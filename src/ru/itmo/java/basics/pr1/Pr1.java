package ru.itmo.java.basics.pr1;

import java.util.Scanner;

public class Pr1 {

    //Задание 1
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        //Задание 2
        double n = ((46 + 10) * (10 / 3.d));
        double m = 29 * 4 * (-15);
        System.out.println(n);
        System.out.println(m);
        //Задание 3
        double number = 10500;
        double result = (number / 10) / 10;
        System.out.println(result);
        //Задание 4
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result2 = 3.6 * 4.1 * 5.9;
        System.out.println(result2);
        //Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа:");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(x + "\n" + y + "\n" + z);
        //Задание 6
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        if (b % 2 == 0) {
            System.out.println("b - Четное");
        } else {
            System.out.println("b - Нечетное");
            if (b % 2 == 0 && b > 100) {
                System.out.println("Выход за пределы диапозона");
            }
        }


    }
}
