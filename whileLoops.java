import java.util.Scanner;

public class whileLoops {
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
//        System.out.print("Enter number to find prime factor: ");
//        int prime_fact = sc.nextInt();
//        int i = 2;
//        while(prime_fact > 1) {
//            if(prime_fact%i == 0) {
//                prime_fact /= i;
//                System.out.println(i); //print the factor
//            }
//            else {
//                i++; //increment when i can no further divisible from prime_fact
//            }
//        }

        //Prime factor of 2 numbers
//        System.out.print("Enter number 1: ");
//        int prime_fact1 = sc.nextInt();
//
//        System.out.print("Enter number 2: ");
//        int prime_fact2 = sc.nextInt();
//
//        int i = 2; //checking_number
//
//        while(prime_fact1 > 1 || prime_fact2 > 1) {
//            if(prime_fact1%i == 0 || prime_fact2%i == 0) {
//                System.out.println(i);
//            }
//            if(prime_fact1%i == 0) {
//                prime_fact1 /= i;
//            }
//            if(prime_fact2%i == 0) {
//                prime_fact2 /= i;
//            }
//            else {
//                i++;
//            }
//        }

        // Greatest Common factor
//        System.out.print("Enter number 1: ");
//        int gcf1 = sc.nextInt();
//
//        System.out.print("Enter number 2: ");
//        int gcf2 = sc.nextInt();
//
//        int i = 2; //check number
//
//        while(gcf1 > 1 || gcf2 > 1) {
//            if(gcf1%i == 0 && gcf2%i == 0) {
//                System.out.println(i);
//            }
//            if(gcf1%i == 0) {
//                gcf1 /= i;
//            }
//            if(gcf2%i == 0) {
//                gcf2 /= i;
//            }
//            else {
//                i++;
//            }
//        }

        // Fibonacci series
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//
//        int n1 = 0, n2 = 1, n3;
//        int i = 1;
//        System.out.print(n1 + " " + n2);
//        while(i <= num) {
//            n3 = n1 + n2;
//            System.out.print(" " + n3 + " ");
//            n1 = n2;
//            n2 = n3;
//            i++;
//        }

        //Prime Number
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int i = 2, count = 0;
//        while(i < Math.sqrt(n)) {  // math function because iterating the loop till root of the number will give the same output
//            if(n % i == 0) {
//                count++;
//                break; // even if count becomes 1 it means the number is prime and it will also make it fast
//            }
//            i++;
//        }
//        if(count > 0) {
//            System.out.println("Not prime");
//        }
//        else {
//            System.out.println("Prime");
//        }

        //Input 2 numbers a and b find a to the power b
//        System.out.print("Enter number 1: ");
//        int a = sc.nextInt(); // input number 1
//
//        System.out.print("Enter number 2: ");
//        int b = sc.nextInt(); // input number 2
//
//        int c = 1; // to store the product
//
//        while(b > 0) {
//            c *= a; // multiply the value of a by itself in each iteration and store it in c
//            b--;
//        }
//        System.out.println(c);


        // nearest perfect square
//        System.out.print("Enter a number: ");
//        int squ = sc.nextInt();
//
//        int ans = 1;
//
//        while(ans*ans <= squ) {
//            ans++;
//        }
//
//        ans = ans -1;
//        System.out.print(ans);


        // Change the number according o the user input
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//        System.out.print("Enter value of k: ");
//        int rotations = sc.nextInt();
//
//        int count = 0; // finding number of digits
//        int temp = num;
//        while(temp > 0) {
//            count++;
//            temp/=10;
//        }
//
//        int pow = 1; // finding number of zeros
//        int tempCount = count;
//        while(tempCount -1 > 0) {
//            pow*= 10;
//            tempCount--;
//        }
//
//        // to count the number of rotations
//        int daksh = 0;
//
//        //if the number of rotations are more than the number of digits
//        rotations %= count;
//
//        //if the number of rotations are in negative
//        if(rotations < 0) {
//            rotations = count + rotations;
//        }
//
//        while(rotations > 0){
//            num = ((num % 10) * pow) + (num / 10);
//            daksh++;
//            rotations--;
//        }
//
//        System.out.println(num);
//        System.out.println(daksh);


    }
}
