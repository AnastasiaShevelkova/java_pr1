package ru.itmo.java.basics.pr3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study("Изчучение Java - это просто!");
        System.out.println(study.printCourse());
        Car car1 = new Car("white", 20.5);
        Car car2 = new Car("black");
        car1.setName("Mersedes-Benz");
        car2.setName("Audi");
        car2.setWeight(16.5);
        System.out.println(car1.enterData()+";"+car2.enterData());
        House house1 = new House();
        House house2 = new House();
        house1.setAll(25,1969,"Пейзажная");
        house2.setAll(5,1979,"Мир");
        System.out.println(house1.enterAll()+","+house1.quantityYears()+"лет");
        System.out.println(house2.enterAll()+","+house2.quantityYears()+"лет");
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(20,"Birch");
        Tree tree3 = new Tree(7,true, "Oak");
        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());





    }
}
