package ru.itmo.java.basics.p6;

public class Main {
    public static void main(String[] args) {


        BankEmployee patrick = new BankEmployee("Patrick", "Lee", "Bank of America");
        patrick.getInfo();
      ;


        Client alice = new Client("Alice", "Reynolds", "Bank of America");
        alice.getInfo();



        Gazel gazel = new Gazel(5000000,"BMW","Black",100,4,250);
        gazel.outPut();
        gazel.setNewWheels(5);
        System.out.println("Максимальная скорость:" + gazel.getMaxWeight());
        User user= new User();
        System.out.println(user.getUserInfo());









}}





