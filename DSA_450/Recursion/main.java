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

    public static void main(String[] args) {

        int ans = pow(5,3);
        System.out.println(ans);
    }
}
