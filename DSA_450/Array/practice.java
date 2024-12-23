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

    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};
        

    }
}
