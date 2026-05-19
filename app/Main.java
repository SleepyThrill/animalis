package app;

import enums.FurColor;

import model.Cat;

public class Main {
    public static void main(String[] args) {

        // Com certeza não é o gato da minha ex... :3
        Cat cat1 = new Cat("Loki", 3, 4.5, FurColor.fromCode(4), true, "Salmon", 25, true);
        cat1.displayInfo();

    }
}
