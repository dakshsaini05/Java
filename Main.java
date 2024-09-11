import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using scanner class to take input
        System.out.print("Enter number 1: ");
        int n = sc.nextInt(); // first number input

        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt(); // second number input

        int n3 = n + n2;
        System.out.println(n3);

        String name = "Daksh";
        String lname = "Saini";
        System.out.println(name + " " + lname); //String concatenation

    }
}