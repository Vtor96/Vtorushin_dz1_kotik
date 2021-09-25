package model;

import java.util.Objects;
import java.util.Random;

public class Kotik {

    private String name;
    private int weight;
    private static int objectCount = 0;
    private static boolean hungryKot;

    private int satiety = 2;
    private int prettiness;
    private String meow;

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.objectCount++;
    }

    public Kotik() {
        objectCount++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kotik kotik = (Kotik) o;
        return meow.equals(kotik.meow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meow);
    }

    public static Kotik setKotik(int prettiness, String name, int weight, String meow) {
        return new Kotik(prettiness, name, weight, meow);
    }

    public void liveAnotherDay() {
        for (int i = 0; i <= 24; i++) {
            Random random = new Random();
            int number = random.nextInt(5) + 1;

            switch (number) {
                case 1:
                    if (isHungryKot())
                        System.out.println("Кот голоден");
                    else
                        play();
                    break;
                case 2:
                    if (isHungryKot())
                        System.out.println("Кот голоден");
                    else
                        say();
                    break;
                case 3:
                    if (isHungryKot())
                        System.out.println("Кот голоден");
                    else
                        sleep();
                    break;
                case 4:
                    if (isHungryKot())
                        System.out.println("Кот голоден");
                    else
                        chaseMouse();
                    break;
                case 5:
                    if (isHungryKot())
                        System.out.println("Кот голоден");
                    else
                        eat();
                    break;
            }
        }
    }

    public void eat() {
        eat(2, "Рыбу");
    }

    public void eat(int kolvoedy) {
        System.out.println("Кот кушает");
        satiety += kolvoedy;
    }

    public void eat(int kolvoedy, String foodName) {
        System.out.println("Кот кушает " + foodName);
        satiety += kolvoedy;
        hungryKot = false;
    }

    private boolean isHungryKot() {
        if (satiety <= 0) {
            System.out.println("Кот голоден! Корми его!");
            hungryKot = true;
            eat();
        }
        return hungryKot;
    }

    public void play() {
        System.out.println("Кот играет");
        satiety--;
    }

    public void say() {
        System.out.println("Мяу");
        satiety--;
    }

    public void sleep() {
        System.out.println("Кот уснул");
        satiety--;
    }

    public void chaseMouse() {
        System.out.println("Кот поймал мышь");
        satiety--;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public String getMeow() {
        return meow;
    }
}
