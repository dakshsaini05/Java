import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Right-angled triangle
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverse right-angled triangle
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=(4-i)+1;j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Opposite sided right-angled triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(j <= (5 - i)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Opposite sided inverse right-angled triangle
//        int a = 0;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(j > i-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
//            a++;
            System.out.println();
        }

        //Odd number triangle
        for(int i=1;i<=5;i++) {
            int k =0;
            for(int j=1;j<=i;j++) {
                System.out.print((k * 2) + 1);
                k++;
            }
            System.out.println();
        }

        //Odd number sequence triangle
        int nextNum = 1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(nextNum + " ");
                nextNum += 2;
            }
            System.out.println();
        }

        //Even number triangle
        for(int i=1;i<=5;i++) {
            int k = 1;
            for(int j=1;j<=i;j++) {
                System.out.print(k*2 + " ");
                k++;
            }
            System.out.println();
        }

        //Even number sequence triangle
        int nextNum2 = 2;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(nextNum2 + " ");
                nextNum2 += 2;
            }
            System.out.println();
        }

        //Hollow rectangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Pyramid triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(j <= 5 - i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        //Hollow triangle
        int n = 5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(j == n-i+1 || i == 1 || j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Hollow 180 degree K
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(j == n-i+1 || i == 1 || j == 1) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for(int j=n-1;j>0;j--) {
                if(j == n-i+1 || i == 1 || j == 1) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Number pyramid
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=n;j++) {
                if(j<=(n-i)+1) System.out.print("  ");
                else System.out.print(i + " ");
            }

            for(int j=1;j<=n;j++) {
                if(j > i) System.out.print("  ");
                else System.out.print(i + " ");
            }
            System.out.println();
        }

        //Number increasing triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Number increasing reverse triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=(5-i)+1;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Number changing triangle
        int count = 1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        //Zero-One triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        //Palindrome pyramid*
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=2;j--) {
                if(j <= (n-i)+1) System.out.print("  ");
                else System.out.print(j + " ");
            }

            for(int j=1;j<=5;j++) {
                if(j > i) System.out.print("  ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }

        // Rhombus pattern
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=1;j--) {
                if(j >= (n-i)+1) System.out.print("  ");
                else System.out.print("* ");
            }

            for(int j=1;j<=5;j++) {
                if(j > i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }


    }
}
