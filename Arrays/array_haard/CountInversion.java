package Arrays.array_haard;

public class CountInversion {

    static int count;

    public static void inversionCount(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                count += a.length - i;
                j++;
            } else
                i++;
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[n / 2 + i];
        }
        mergeSort(a);
        mergeSort(b);
        // inversionCount(a, b); // we are doing inversion count directly in merging arrays
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int m = 0, n = 0, k = 0;
        while (m < a.length && n < b.length) {
            if (a[m] <= b[n])
                c[k++] = a[m++];
            else{
                count += a.length - m; // we are doing inversion count directly in merging arrays
                c[k++] = b[n++];
            }
                
        }

        while (m < a.length)
            c[k++] = a[m++];
        while (n < b.length)
            c[k++] = b[n++];

    }

    public static void main(String[] args) {
        count=0;
        int[] arr = { 5, 3, 2, 1, 4 };
        mergeSort(arr);
        System.out.println(count);
    }
}