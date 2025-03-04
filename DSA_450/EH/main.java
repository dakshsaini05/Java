package DSA_450.EH;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


//        Arithumetic exception
//        System.out.println("Hello");
//        try {
//            int a = 10/0;
//        } catch (Exception e) {
//            System.out.println("Can not divide by zero");
//            System.out.println(e);
//        }
//        System.out.println("Java");

//        NullPointerException
//        try {
//            String a = null;
//            System.out.println(a.length());
//        } catch (Exception e) {
//            System.out.println("String is empty");
//        }

//        InputMissMatchException
//        int a;
//        System.out.print("Enter the value of a: ");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        System.out.println("The value of a is " + a);

//        NumberFormatException
//        String s = "abc";
//        int num = Integer.parseInt(s);
//        System.out.println("Number is " + num);

//        Try with multiple catch
//        int[] arr = new int[2];
//        arr[0] = 10;
//        arr[1] = 20;
//        try {
//            System.out.println(arr[2]/0);
//        } catch (ArithmeticException e1) {
//            System.out.println(e1);
//        } catch (ArrayIndexOutOfBoundsException e2) {
//            System.out.println(e2);
//        } catch (Exception e3) {
//            System.out.println(e3);
//        }

//        Nested try catch
        int[] arr = new int[2];
        try {
            System.out.print("Enter the value for index 0: ");
            arr[0] = sc.nextInt();
            System.out.print("Enter the value for index 1: ");
            arr[1] = sc.nextInt();

            try {
                System.out.print("Enter the index value for 0th index: ");
                int nindex = sc.nextInt();
                int numerator = arr[nindex];
                System.out.print("Enter the index value for 1st index: ");
                int dindex = sc.nextInt();
                int denominator = arr[dindex];
                double result = (double) numerator / denominator;
                System.out.println(result);
            }
            catch (ArithmeticException e1) {
                System.out.println("can't"+e1.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Please enter correct index");
            }
        } catch (InputMismatchException e1) {
            System.out.println("Please enter integer value");
        }
    }
}
