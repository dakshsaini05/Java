package Revision;

public class main {
    public static void main(String[] args) {
//        System.out.println("Hello Everyone");
//        System.out.println((char) 10084);
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));
//
//        // String Immutability
//        String name = "Daksh";
//        name.toUpperCase();
//        System.out.println(name);
//
//        //Correct way
//        // option one
//        String newName = name.toUpperCase();
//        System.out.println(newName);
//
//        // option two
//        name = name.toUpperCase();
//        System.out.println(name);
//
//        // Array
//        int[] arr = {1, 2, 3, 4 ,5 ,60, 45, 53};
//        for(int i : arr) {
//            System.out.println(i);
//        }

        // OOPs

//        Encapsulation
//        Car myCar1 = new Car();
//        myCar1.setColor("Green");
//        myCar1.setSpeed(60);
//
//        System.out.println(myCar1.getColor());
//        System.out.println(myCar1.getSpeed());

//        Inheritance
//        Dog myDog = new Dog();
//        myDog.name = "Sheru";
//        myDog.eat();
//
//        Calculator calc = new Calculator();
//        System.out.println(calc.add(2, 3));
//        System.out.println(calc.add(1, 2, 3));

//        Abstraction
        Human h1 = new Boy();
        Human h2 = new Girl();
        h1.sayHello();
        h2.sayHello();
        h1.sayBye();
        h2.sayBye();

        smartPhone s1 = new smartPhone();
        s1.makeCall();
        s1.playMusic();

//        Singleton class
        School s21 = School.getInstance();
        s21.homeWork();
    }   
}

//Inheritance
class Animal {
    String name;
    String voice;
    int legs;

    public void eat() {
        System.out.println(this.name + " eats");
    }
}

class Dog extends Animal {
    String color;

    public void bark() {
        System.out.println("Dog is barking");
    }
}

//Polymorphism
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Abstraction
abstract class Human {
    abstract void sayHello();
    abstract void sayBye();

    public void sleep() {
        System.out.println("zzzzzzz......");
    }
}

class Boy extends Human{
    public void sayHello() {
        System.out.println("Hi boy");
    }
    public void sayBye() {
        System.out.println("Bye boy");
    }
}

class Girl extends Human {
    public void sayHello() {
        System.out.println("Hi girl");
    }
    public void sayBye() {
        System.out.println("Bye girl");
    }
}

interface Mobile {
    void makeCall();
}
interface MusicPlayer {
    void playMusic();
}
class smartPhone implements Mobile, MusicPlayer {

    @Override
    public void makeCall() {
        System.out.println("making call...");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music...");
    }
}

// Static method in interface
