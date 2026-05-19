package model;

import enums.Habitat;
import enums.FurColor;

public class Cat extends Animal {

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    public Cat(String name, int age, double weight, FurColor furColor, boolean isIndoor, String favoriteFood,
            int purringFrequency, boolean isNeutered) {
        super(name, 30, age, weight, isIndoor ? Habitat.DOMESTIC : Habitat.URBAN, false);
        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    // Overrides

    @Override
    public void makeSound() {
        System.out.println(getName() + "meows: at" + purringFrequency + " Hz!");

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " finds the warmest spot and sleeps for 14 hours.");
    }

    // Overloads

    public void move(int distance, int speed) {
        System.out.println(getName() + " leaped " + distance + " meters at " + speed + " km/h!");
    }

    public void move(int distance, String target) {
        System.out.println(getName() + " silently stalked " + distance + " meters toward the " + target + "...");
    }

    // Custom Methods

    public void purr() {
        System.out.println(getName() + " is purring at " + purringFrequency + " Hz.");
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println(getName() + " lost a life! Lives left: " + lives + ".");
        } else {
            System.out.println(getName() + " has no lives left!");
        }
    }

    // Displays Info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lives: " + lives);
        System.out.println("Fur Color: " + furColor.getDisplayName());
        System.out.println("Indoor Cat? " + (isIndoor ? "Yes" : "No"));
        System.out.println("Favorite Food: " + favoriteFood);
        System.out.println("Purring Frequency: " + purringFrequency + " Hz");
        System.out.println("Neutered? " + (isNeutered ? "Yes" : "No"));
    }

    // Getters
    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}
