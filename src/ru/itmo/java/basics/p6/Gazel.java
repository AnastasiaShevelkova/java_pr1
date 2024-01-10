package ru.itmo.java.basics.p6;

public class Gazel extends Car {
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

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
    public void wheels(){
        System.out.printf("Кол-во колес:%s\n", wheels);

    }public void maxWeight(){
        System.out.printf("Максимальная скорость:%s\n", maxWeight);



    }
}

