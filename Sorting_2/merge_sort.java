package Sorting_2;

public class merge_sort {
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
    
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        for(int i=0;i<a.length;i++){
            a[i] = arr[i];
        }
        for(int i=0 ;i <b.length;i++){
            b[i] = arr[n/2 + i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);

    }

    public static void merge(int[] a, int[] b ,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] =a[i++];
        while (j<b.length) c[k++] = b[j++];
    }
    public static void main(String[] args) {
        int[] arr = { 9, 8,0,1 ,7, 65, -1, 4, 3, 2 };
        mergeSort(arr);
        print(arr);
    }
}
