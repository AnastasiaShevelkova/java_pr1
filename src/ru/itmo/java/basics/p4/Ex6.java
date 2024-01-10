package ru.itmo.java.basics.p4;

public class Ex6 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        boolean found = false;
        int searchedValue = 1;
        int searchedValue2 = 3;

        for(int x : intArray){
            if(x == searchedValue || x == searchedValue2){
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
