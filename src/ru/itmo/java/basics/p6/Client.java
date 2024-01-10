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
    public void bank(){
        System.out.printf("Название банка:%s\n",bank);
    }

    @Override
    public void absctractMethod() {

    }



}












