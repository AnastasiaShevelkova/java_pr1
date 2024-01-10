package ru.itmo.java.basics.p6;

public class BankEmployee extends Human {
    private String bank;


    public BankEmployee(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public void bank() {
        System.out.printf("Название банка:%s\n", bank);


    }

    @Override
    public void absctractMethod() {

    }
}







