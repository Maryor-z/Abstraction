package com.maryor;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Juice");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguin penguin = new Penguin("X");
        penguin.fly();
    }
}
