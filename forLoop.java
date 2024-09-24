import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Rectangle
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Right angled triangle
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        for(int i=1;i<=b;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Number right-angled triangle 1
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Number right-angled triangle 2
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Number right-angled triangle 3
        int count = 1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
}
