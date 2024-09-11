import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from Student
        System.out.print("Enter marks of Hindi: ");
        float hin = sc.nextFloat(); // Hindi Marks


        System.out.print("Enter marks of English: ");
        float eng = sc.nextFloat(); // English Marks


        System.out.print("Enter marks of Maths: ");
        float math = sc.nextFloat();


        System.out.print("Enter marks of Science: ");
        float sci = sc.nextFloat();


        System.out.print("Enter marks of SST: ");
        float sst = sc.nextFloat();

        // Calculating Percentage
        float per = (hin + eng + math + sci + sst) / 500 * 100;
        System.out.println("Percentage: " + per);

        // Grades according to marks

        if(per >= 90) {
            System.out.println("Excellent");
        }
        else if(per >= 80) {
            System.out.println("Very good");
        }
        else if(per >= 70) {
            System.out.println("Good");
        }
        else if(per < 70) {
            System.out.println("Failed");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
