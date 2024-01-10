package ru.itmo.java.basics.p4;

public class Ex5 {
    public static void main(String[] args) {
        int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(array[i]);
        }
        System.out.println((array[0]==3 || array[array.length-1]==3));
    }
}
