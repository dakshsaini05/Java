package DSA_450.Array;

import java.util.Arrays;

public class practice {

    //Bubble Sort
    static int[] bubble(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    // 1. Two sum
    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return new int[]{};
    }

    //Rotate array by k
    static int[] rotateArr(int[] arr, int k) {
        int n = arr.length;

        if(k<0) {
            k = k+(k%n);
        }
        k=k%n;

        int[] tempArr = new int[k];

        int count = 0;

        for(int i=n-1;i>n-k;i--) {
            tempArr[count] = arr[n-k+count];
            count++;
        }

        for(int i=n-k;i>=1;i--) {
            arr[n-k+1] = arr[i-1];
        }

        for(int i=0;i<tempArr.length;i++) {
            arr[i] = tempArr[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};
        int[] result = twoSum(arr, 5);
        for(int i : result) {
            System.out.print(i+" ");
        }

    }
}
