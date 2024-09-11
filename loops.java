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
//        int count = 0;
//        System.out.print("Enter number(don't put zero in between): ");
//        int num1 = sc.nextInt();
//
//        while(num1 > 0) {
//            num1 /= 10;
//            count++;
//        }
//        System.out.println(count);

        // Reverse a number and print it vertically
//        System.out.print("Enter number: ");
//        int r = sc.nextInt();
//        int rem = 0, sum = 0;
//        while(r > 0) {
//            rem = r % 10;
//            System.out.println(rem);
//            r /= 10;
//        }

        // Prime factor
        System.out.print("Enter number to find prime factor: ");
        int prime_fact = sc.nextInt();
        int i = 2;
        while(prime_fact > 1) {
            if(prime_fact%i == 0) {
                prime_fact /= i;
                System.out.println(i); //print the factor
            }
            else {
                i++; //increment when i can no further divisible from prime_fact
            }
        }
    }
}
