package ru.itmo.java.basics.p6;

public class BankEmployee extends Human{
    private String bank;


    public BankEmployee(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }


    @Override
    public void getInfo() {
        System.out.println("Название банка: " + this.bank);
        System.out.println("Сотрудник банка: " + this.getName() + " " + this.getSurname());
    }
    }












