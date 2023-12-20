package ru.itmo.java.basics.pr3;

public class House {
    int floor;
    int year;
    String name;
    public void setAll(int floor, int year,String name){
        this.name = name;
        this.floor = floor;
        this.year = year;
    }
    public String enterAll(){
        return name+","+floor+","+year;
    }
    public int quantityYears(){
        return 2023-year;
    }

}



