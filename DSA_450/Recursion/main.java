package DSA_450.Recursion;

public class main {

    //Print a numbers in increasing order
    public static void increase(int n) {

        if(n < 0) return;

        increase(n-1);
        System.out.println(n);

    }

    //Find the factorial of a number
    public static int factorial(int n) {
        if(n == 1) return 1;

        int num = n * factorial(n-1);
        return num;
    }

    //Find the power of a (Method 1)
    public static int pow(int a, int b) {
        if(b == 1) return a;

        return a * pow(a,b-1);
    }

    //Find the power of a (Method 2)
    public static int pow2(int a, int b) {
        if(b == 1) return a;

        int power = pow(a,b/2);
        int ans = power*power;

        if(b%2 != 0) ans = ans*a;

        return ans;
    }

    public static int fibo(int n) {
        if(n <= 1) return n;

        int fib = fibo(n-1) + fibo(n-2);
        return fib;
    }

    public static void zigZag(int n) {
        if(n == 0) return;

        System.out.println("pre "+n);
        zigZag(n-1);
        System.out.println("in "+n);
        zigZag(n-1);
        System.out.println("post "+n);

    }

    public static void main(String[] args) {

       zigZag(3);
    }
}
