package DSA_450.Array;



public class sorting {

    static int[] swap(int[] arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;

        return arr;
    }

    static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        //bubble sort
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap arr[minIndex] = arr[i]
            swap(arr, minIndex, i);
        }

        return arr;
    }

    static int[] sortZeroOneTwo(int[] arr) {
        int n = arr.length;

        //Brute force approach
//        for(int i=0;i<n-1;i++) {
//            int minIndex = i;
//            for(int j=i+1;j<n;j++) {
//                if(arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            swap(arr, minIndex, i);
//        }

        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++) {
            if(arr[i] == 0) {
                c0 += 1;
            }
            if(arr[i] == 0) {
                c1 += 1;
            }
            if(arr[i] == 0) {
                c2 += 1;
            }
        }
        int idx = 0;

        for(int i=0;i<c0;i++) arr[idx++] = 0;
        for(int i=0;i<c1;i++) arr[idx++] = 1;
        for(int i=0;i<c2;i++) arr[idx++] = 2;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};

//        bubbleSort(arr);
//        selectionSort(arr);

        sortZeroOneTwo(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
