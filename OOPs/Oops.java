package OOPs;

public class Oops {
    public static void main(String[] args) {

        // Question 1
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        counter c4 = new counter();
        c1.displayCount();
        c2.displayCount();
        c3.displayCount();

        // Question 2
        int s = mathUtil.square(5);
        System.out.println(s);
    }
}

class Animal {
    String name;
    int legs;
    int age;

    static void eat() {
        System.out.println("OOPs.Animal eating food");
    }

    static void sleep() {
        System.out.println("OOPs.Animal is sleeping");
    }
}

class person {
    String name;
    int age;
    static int count = 0;
}

class car {
    static String name;
    int wheels;
    String color;

    static void run() {
        System.out.println(name + " is running");
    }
}

class bmw extends car {
    
}

class counter {
    static int count;

    counter() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

class mathUtil {


    static int square(int number) {
        return number*number;
    }
}