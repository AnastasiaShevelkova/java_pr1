package ru.itmo.java.basics.pr2;

public class Calculator {
    public int sum( int x, int y ){
        return x+y;
    }
    public double sum(double x, double y){
        return x+y;
    }
    public long sum(long x, long y){
        return x+y;
    }
    public int sub( int x, int y ){
        return x-y;
    }
    public double sub(double x, double y){
        return x-y;
    }
    public long sub ( long x, long y){
        return x - y;
    }
    public int mul ( int x, int y ){
        return x * y;
    }
    public double mul ( double x, double y){
        return x * y;
    }
    public long mul ( long x, long y ){
        return x * y;
    }
    public int div ( int x, int y){
        return (x / y) + (x % y);
    }
    public double div ( double x, double y){
        return x / y;
    }
    public long div (long x, long y){
        return  x/ y;
    }
    public void enter () {
        System.out.println("\nСложение:");
        System.out.println(sum(4, 5));
        System.out.println(sum(5.4, 8.9));
        System.out.println(sum(600000L, 400000l));
        System.out.println("\nВычитание");
        System.out.println(sub(6, 7));
        System.out.println(sub(5.6, 4.4));
        System.out.println(sub(600000L, 400000L));
        System.out.println("\nУмножение:");
        System.out.println(mul(89, 60));
        System.out.println(mul(78.9, 5.6));
        System.out.println(mul(600000l, 400000l));
        System.out.println("\nДеление:");
        System.out.println(div(10,2));
        System.out.println(div(55.1, 7.2));
        System.out.println(div(600000L,400000L));

    }
}

