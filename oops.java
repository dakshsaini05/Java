public class oops {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
    }
}

class Animal {
    String name;
    int legs;
    int age;

    static void eat() {
        System.out.println("Animal eating food");
    }

    static void sleep() {
        System.out.println("Animal is sleeping");
    }
}
