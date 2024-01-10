package ru.itmo.java.basics.p6;

public class Main {
    public static void main(String[] args) {


        BankEmployee patrick = new BankEmployee("Patrick", "Lee", "Bank of America");
        patrick.info();
        patrick.bank();
      ;


        Client alice = new Client("Alice", "Reynolds", "Bank of America");
        alice.info();
        alice.bank();


        Gazel gazel = new Gazel(5000000,"BMW","Black",100,4,250);
        gazel.outPut();
        gazel.setWheels(4);
        gazel.wheels();
        gazel.maxWeight();




        //printInformatioleName(patrick);
        //printInformatioleName(alice);


        MainClass mainObject = new MainClass(); // Создаем объект главного класса

        SubClass subObject = new SubClass(mainObject); // Создаем объект на основе класса-наследника

        int userAge = mainObject.getAge(); // Получаем возраст пользователя

        subObject.printVariable(); // Выводим nеременную из главного класса через метод класса-наследника
        subObject.printName(); // Используем переопределенный метод для получения имени пользователя
    }


}





