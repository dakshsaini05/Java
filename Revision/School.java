package Revision;

// Singleton class
public class School {
    private static School school = new School();

    private School() {

    }

    public void homeWork() {
        System.out.println("Do homework");
    }

    public static School getInstance() {
        return school;
    }
}
