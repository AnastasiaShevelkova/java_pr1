package ru.itmo.java.basics.p6;

public class Gazel extends Car {
    private int wheels;

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int maxWeight;

    public Gazel(int w, String m, String c, float s, int wheels,int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;

    }
    public Gazel(int wheels, int maxWeight){
        this.wheels = wheels;
        this.maxWeight = maxWeight;

    }
    public void setNewWheels(int newWheels){
        this.wheels = newWheels;
        System.out.println("Теперь у грузовика " + wheels + "\nколеc");
    }








    }


