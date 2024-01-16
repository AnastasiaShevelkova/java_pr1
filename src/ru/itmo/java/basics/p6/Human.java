package ru.itmo.java.basics.p6;

public abstract class Human {
    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Human(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }
    public abstract void getInfo();
    }








