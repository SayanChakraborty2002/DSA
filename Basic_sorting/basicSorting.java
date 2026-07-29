package Basic_sorting;

public class basicSorting {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // T.C= Avg -> O(n*n)
    public static void selection(int[] arr) {
        // In selection sort we places the smallest element in its place
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mindex = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            swap(arr, mindex, i);
        }
    }

    // T.C= Avg -> O(n*n) , best-> O(n);
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // In bubble sort we are placing the greatest element in its position
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    swap(arr, j, j + 1);
                }
            }
            if (flag)
                break;
        }
    }

    public static void insertionSort(int[] arr) {
        int n=arr.length;
        //In insertionsort we mantain an sorted array
        for(int i=0;i<n;i++){
            for(int j=i;j>0 ;j--){
                if(arr[j]<arr[j-1]) swap(arr, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8,0,1 ,7, 65, -1, 4, 3, 2 };
        insertionSort(arr);
        print(arr);
    }

}
