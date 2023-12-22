package ru.itmo.java.basics.pr2;

public class Dog {
    public String name;
    public int age;
    public Color color;

    public Dog(){
        System.out.println("Создали собаку");
    }
    public Dog(String name,int age, Color color){
        this.name=name;
        this.age=age;
        this.color=color;
        System.out.println("Создали собаку и прописали пораметры");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", color"+ color+ "}";

    }
}


