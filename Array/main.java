package Array;
import java.util.*;

public class main {
    //Function that returns the index of the target value
    public static int findIndex(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;


    }

    //Function to find the max element in the array
    static int maxEl(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n;i++) {
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    //Function to find the min element in the array
    static int minEl(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for(int i=1;i<n;i++) {
            if(min > arr[i]) min = arr[i];
        }
        return min;
    }

    //Function to print pattern one(horizontal bar chart)
    static void barChart(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<arr[i];j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Function to print pattern one(vertical bar chart)
    static void barChart2(int[] arr) {
        int n = arr.length;
        int max = maxEl(arr);
        for(int i=max;i>0;i--) {
            for(int j=0;j<n;j++) {
                if(arr[j] >= i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void moveZero(int[] a) {
        int n = a.length;
        int id= 0; // non-zero element position //id= index value

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                // swaping a non-zero element with index value
                int temp = a[i]; // putting value in temp
                a[i] = a[id];
                a[id] = temp;

                id++; // move the index value
            }
        }
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.print("Enter the length of the array: ");
//        int arrLen = sc.nextInt();
//
//        int[] age = new int[arrLen];
//
//        // Input of array
//        for(int i=0;i<age.length;i++) {
//            System.out.print("Enter age: ");
//            age[i] = sc.nextInt();
//        }
//
//        // Print the array
//        for(int i=0;i<age.length;i++) {
//            System.out.println(age[i]);
//        }
//
//
//        int maxAge = age[0];
//        int minAge = age[0];
//        for(int i=1;i<age.length;i++) {
//            //Calculating the max age in the array
//            if(maxAge < age[i]) {
//                maxAge = age[i];
//            }
//
//            //Calculating the min age in the array
//            if(minAge > age[i]) {
//                minAge = age[i];
//            }
//        }
//        System.out.println("The maximum number in the array is: "+maxAge);
//        System.out.println("The minimum age in the array is: "+minAge);
//
//        //Calculating the spam of age in the array
//        int spanAge = maxAge - minAge;
//        System.out.println("The span of age in the array is: "+spanAge);

//        //Function that returns the index of the target value
//        int[] arr = {10,20,30,40,50};
//        System.out.println("Array: "+Arrays.toString(arr));
//        System.out.print("Enter the value from the array to get it's index: ");
//        int target = sc.nextInt();
//        int index = findIndex(arr, target);
//        if(index == -1) System.out.println("The number entered is not in the array");
//        else System.out.println("The index of "+target+" is "+index);

        //Print * horizontally in sequence to the value of the elements in the array
        int[] numArr = {5,3,0,4,2};
        moveZero(numArr);


    }
}
