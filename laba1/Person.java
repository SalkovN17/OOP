package oop_laba1;

public class Person {
    private int age;
    private int height;
    private String name;

    public Person(int age, int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public String getName(){
        return name;
    }
    public String stringize(){
        return new String(name.toString() + " " + age + " " + height + "\n");
    }
}
