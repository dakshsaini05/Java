package DSA_450.Array;
import java.util.*;

public class main {
    //A function to use swap in different questions
    static int[] swap(int[] arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;

        return arr;
    }


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

    //283. Moving zeroes
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

    //189. Rotate
    static int[] rotate(int[] nums, int k) {
        int n = nums.length;

        if (k < 0) { // Handle cases where k is negative
        k = n + (k % n);
        }
        k = k % n; // Handle cases where k is greater than n

        //Make an array with the length of k
        int[] tempArr = new int[k];

        //make variable to track the index value of tempArr
        int count = 0;

        //loop to extract the values according to k
        for(int i=n-1;i>=n-k;i--) {
            tempArr[count] = nums[n-k+count];
            count++;
        }

        //loop to shift the rest of the values to the last or to the right
        for(int i=n-k;i>=1;i--) {
            nums[i+k-1] = nums[i-1];
        }
        //loop to shift the tempArr at the front of the original array
        for(int i=0;i<tempArr.length;i++) {
            nums[i] = tempArr[i];
        }

        return nums;
    }

    //Add to arrays
//    static void addArr(int[] arr1, int[] arr2) {
//        int n = arr1.length;
//        int[] newArr = new int[Math.max(int[] arr1, int[] arr2)];
//        for(int i=n-1;i>=0;i--) {
//            newArr[i] = arr1[i] + arr2[i];
//        }
//        for(int i=0;i<newArr.length;i++) {
//            System.out.print(newArr[i]+" ");
//        }
//    }

    //Finding the second max value
    static void secMax(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(max < arr[i]) {
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && max > arr[i]) {
                secMax = arr[i];
            }
        }

        System.out.println(max +" "+secMax);
    }

    //Finding the second min value
    static void secMin(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int secMin = Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            if(min > arr[i]) {
                secMin = min;
                min = arr[i];
            } else if (secMin>arr[i]&&min<arr[i]) {
                secMin = arr[i];
            }
        }

        System.out.println(min+" "+secMin);
    }

    //Array reverse
    static int[] reverse(int[] arr) {
        int n = arr.length;

        //Initialize first value of array to left and last value to right
        int left = 0;
        int right = n-1;

        //Iterate a while loop till the left is smaller than the right
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

    //Move all negative numbers to one side of the array
    static int[] moveNeg(int[] arr) {
         int n = arr.length;
         int left = 0, right = n-1;

         while(left <= right) {
             if(arr[left] < 0 && arr[right] < 0) { //When both pointers are negative
                 left++;
             }
             else if(arr[left] > 0 && arr[right] < 0) {
                 swap(arr, left, right);
                 left++;
                 right--;
             }
             else if(arr[left] < 0 && arr[right] > 0) {
                 right--;
             }
             else {
                 left++;
                 right--;
             }
         }

         return arr;
    }

    //Kth min number
    static int kMin(int[] arr, int k) {
        int n = arr.length;

        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr[k-1];
    }

    //Kth max number
    static int kMax(int[] arr, int k) {
        int n = arr.length;

        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        reverse(arr);


        return arr[k-1];
    }

    //Rotate array by one
    static int[] rotateOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        return arr;
    }

    //Maximum SubArray Sum - Kadane's Algorithm
    static int maxSubArray(int[] arr) {
        int n = arr.length;

        //Stores the sum of the subArray
        int res = arr[0];

        for(int i=0;i<n;i++) {
            //Stores the current sum of the subArray
            int currSum = 0;
            for(int j=i;j<n;j++) {
                //adding the values of the sunArray
                currSum += arr[j];

                if(res < currSum) res = currSum;
            }
        }
        return res;
    }

    //Maximum SubArray Sum - Kadane's Algorithm
    static int kadaneAlgo(int[] arr) {
        int n = arr.length;

        int res = arr[0];
        int sum = 0;

        for(int i=0;i<n;i++) {
            sum += arr[i];

            res = Math.max(res, sum);

            if(sum < 0) sum = 0;
        }

        return res;
    }

    //Rotate arr by K to left
    static int[] rotateByK(int[] arr, int k) {
        int n = arr.length;

        //If k is more than the length of the array
        if(k > n) k=k%n;

        //Make new array according to the k
        int[] temp = new int[k];
        for(int i=0;i<temp.length;i++) {
            temp[i] = arr[i];
        }

        //Shifting the other values to the left
        for(int i=k;i<n;i++) {
            arr[i-k] = arr[i];
        }

        //Putting the values in temp at last
        for(int i=n-k;i<n;i++) {
            arr[i] = temp[(n-k)+i];
        }

        return arr;
    }

    //Linear Search
    static int lSearch(int[] arr, int num) { // Return the index number
        int n = arr.length;

        for(int i:arr) {
            if(arr[i]==num) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5, 6 , 7};

        System.out.print(lSearch(a, 3));





    }
}


//if (k < 0) {
//k = n + (k % n);
//        }
//k = k % n; // Handle cases where k is greater than n
//
//        while(k > 0) { // do all this until k becomes 0
//int temp = nums[n-1]; // Put the last value of the array in a variable
//            for(int i=n-1;i>=1;i--) { // rotate the loop in reverse to get the last value first
//nums[i] = nums[i-1]; // Put the second last value in the place of last value
//        }
//nums[0] = temp; // in last put the last value of the array in first place
//
//k--;
//        }
//
//        return nums;