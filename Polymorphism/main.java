package Polymorphism;

public class main {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Shout!!");
    }

    void walk() {
        System.out.println("Walk!!");
    }

    void eat() {
        System.out.println("Eat!!");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof ...");
    }

    class Cat extends Animal {

    }

}