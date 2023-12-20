package ru.itmo.java.basics.pr2;

public class Main {
    public static void main(String[]args) {
        Calculator calculator = new Calculator();
        calculator.enter();
        Dog d1= new Dog();
        Dog d2 = new Dog("Travis",2, Color.BLACK);
        System.out.println(d1);
        System.out.println(d2);
        d1.setName("Travis");
        d1.setAge(2);
        d1.setColor(Color.BLACK);
        System.out.println(d1);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getColor());


    }
}

