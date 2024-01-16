package ru.itmo.java.basics.p6;
import java.util.Scanner;
public class User extends Person{
    int age;
    String name;
    Scanner scanner = new Scanner(System.in);


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName() {
        super.setName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getUserInfo() {
        super.getUserInfo();
        System.out.println("Имя пользователя? ");
        name = scanner.next();
        return "Имя пользователя: " + name;
    }
    }


