import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while loop

        // 1-100
//        int n = 1;
//        while(n <= 100) {
//            System.out.println(n);
//            n++;
//        }

//        // 100-1
//        int n1 = 100;
//        while(n1 >= 1) {
//            System.out.println(n1);
//            n1--;
//        }

        // 1-100 even number
//        int n = 1;
//        while(n<=100) {
//            if(n%2 == 0) {
//                System.out.println(n);
//            }
//            n++;
//        }

        // 1-100 odd number
//        int n = 1;
//        while(n <= 100) {
//            if(n%2 != 0) {
//                System.out.println(n);
//            }
//            n++;
//        }

        // Printing table
//        System.out.print("Enter number to print table: ");
//        int t = sc.nextInt(); //input number of the table

        //Using loop to iterate table
//        int i = 1;
//        while(i <= 10) {
//            System.out.printf("%d x %d = %d\n", t, i, t*i);
//            i++;
//        }

        //Count digits of a number
        int count = 0;
        System.out.print("Enter number(don't put zero in between): ");
        int num1 = sc.nextInt();

        while(num1 > 0) {
            num1 /= 10;
            count++;
        }
        System.out.println(count);
    }
}