package ru.itmo.java.basics.p6;

import java.util.Scanner;
      class MainClass {
        int age; // Поле для ввода целого числа

        public int getAge() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите возраст пользователя: ");
            age = scanner.nextInt();
            return age;
        }
}
