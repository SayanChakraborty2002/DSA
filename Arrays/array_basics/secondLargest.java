package Arrays.array_basics;

public class secondLargest {
    public static int secondLargestEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                sec = max;
                max = arr[i];
            } else if (sec > arr[i] && max > arr[i])
                sec = arr[i];
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 32, 100, 24, -12, -1, 1202 };
        System.out.print(secondLargestEle(arr));
    }

}
