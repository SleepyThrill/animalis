package model;

import enums.Habitat;

public abstract class Animal {

    private String name;
    private int speed;
    private int age;
    private double weight;
    private Habitat habitat;
    private boolean isWild;

    public Animal(String name, int speed, int age, double weight, Habitat habitat, boolean isWild) {
        this.name = name;
        this.speed = speed;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.isWild = isWild;
    }

    // Method to be OVERRIDEN by subclasses
    public void makeSound() {
        System.out.println(name + " makes a generic sound");
    }

    // Method to be OVERRIDEN by subclasses
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public void move(int distance) {
        System.out.println(name + "moved " + distance + " meters at " + speed + "km/h");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Habitat: " + habitat.getDisplayName());
        System.out.println("Wild? " + (isWild ? "yes" : "no"));
        System.out.println("Speed: " + speed + "km/h");
    }

    // Getters //
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWild() {
        return isWild;
    }

    // Setters //
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
