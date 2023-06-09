package com.example.pr98.fragment;

public class Unit {
    private String name;
    private int age;
    private int image;
    public Unit(String name, int age, int image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getImage(){
        return image;
    }
}
