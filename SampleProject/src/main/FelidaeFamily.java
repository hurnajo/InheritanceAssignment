package main;


import model.Animal;

public class FelidaeFamily extends Animal {
    static Animal animal = new Animal();
    public FelidaeFamily(int age, int weight, String running, String eating) {
        super();
    }
    public static String uniqueBehavior() {
        return "Meow-meow";
    }
}
