package DSA_450.EH;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

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
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        try {
            System.out.println(arr[2]/0);
        } catch (ArithmeticException e1) {
            System.out.println(e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        } catch (Exception e3) {
            System.out.println(e3);
        }
    }
}
