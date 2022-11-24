package Entities;

public class Person {
    private String name;
    private int age;
    private double size;

    public int getAge() {
        return age;
    }

    public double getSize() {
        return size;
    }

    public String getName(){
        return name;
    }

    public Person(String name, int age, double size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

}
