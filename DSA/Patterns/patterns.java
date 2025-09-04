package DSA.Patterns;

import java.util.Scanner;

public class patterns {

    public static void square(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngledTriangle(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverseRightAngledTriangle(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        for(int i=0;i<n;i++) {
            // Space
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }

            // Stars
            for(int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }

            // Space
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void inverseTriangle(int n) {
        for(int i=0;i<n;i++) {
            // space
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*n-(2*i+1);j++) {
                System.out.print("*");
            }
            // space
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void halfDimond(int n) {
        for(int i=0;i<=2*n-1;i++) {
            int stars = i;
            if(i > n) stars = 2*n-i;
            for(int j=0;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        int stars = 1;
        for(int i=0;i<n;i++) {
            if(i%2 == 0) stars = 1;
            else stars = 0;
            for(int j=0;j<i;j++) {
                System.out.print(stars);
                stars = 1 - stars;
            }
            System.out.println();
        }
    }

    public static void hollowTriangle(int n) {
        int space = 2*(n-1);
        for(int i=1;i<=n;i++) {
            // number
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            // space
            for(int j=1;j<=space;j++) {
                System.out.print(" ");
            }
            // number
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void numberedTriangle(int n) {
        int count = 1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void alphabaticalTriangle(int n) {
        for(int i=0;i<n;i++) {
            for(char j='A';j<='A' + i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        alphabaticalTriangle(n);
    }
}
