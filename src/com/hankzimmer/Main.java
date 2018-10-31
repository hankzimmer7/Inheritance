package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        animal.eat();

        Dog yorkie = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        yorkie.eat();
        yorkie.walk();
        yorkie.run();

        Fish nemo = new Fish("Nemo",2,3,2,2,4);
        nemo.swim(8);
    }
}
