package main;

import model.Animal;

public class Tiger extends FelidaeFamily {
    public Tiger(int age, int weight, String running, String eating) {
        super(age, weight, running, eating);
    }
    public static void main(String[] args) {
        animal.setAge(10);
        animal.setEating("Meat");
        animal.setRunning("60.0km/h");
        animal.setWeight(120);

        System.out.println("Tiger Details:");
        System.out.println("Age: "+animal.getAge());
        System.out.println("Food: "+animal.getEating());
        System.out.println("Running Speed: "+animal.getRunning());
        System.out.println("Weight: "+animal.getWeight());
        System.out.println("Unique Sound: "+ uniqueBehavior());
    }
}
