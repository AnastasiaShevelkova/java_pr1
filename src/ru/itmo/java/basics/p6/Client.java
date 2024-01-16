package ru.itmo.java.basics.p6;

public class Client extends Human {
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    private String bank;

    public Client(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void getInfo() {
        System.out.println("Название банка: " + this.bank);
        System.out.println("Клиент банка: " + this.getName() + " " + this.getSurname());
    }

    }

















