package ru.itmo.java.basics.p6;


    class SubClass extends MainClass {
        MainClass mainObject;

        public SubClass(MainClass mainObject) {
            this.mainObject = mainObject;
        }


        public void printVariable() {
            System.out.println("Переменная из главного класса: " + mainObject.age);
        }

        @Override
        public int getAge() {
            return super.getAge();
        }

        public void printName() {
            System.out.println("Имя пользователя: John Doe"); // Пример вывода фиксированного имени

        }
    }