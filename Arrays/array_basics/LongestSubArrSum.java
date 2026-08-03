package Arrays.array_basics;

public class LongestSubArrSum {

    // T.C = O(N*N) ; N=Size of array
    public static int maxSubArrSum(int[] arr, int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int len = 0;
            for (int j = i; j < arr.length; j++) {
                if (sum < k) {
                    sum += arr[j];
                    len++;
                } else if (sum == k) {
                    maxLen = Math.max(maxLen, len);
                } else
                    break;
            }
        }
        return maxLen;
    }

    public static int maxSubArrSumUsingSlidingWindow(int[] arr, int k) {

        // Implementaiton is remained
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 2, 1 };
        int k = 6;
        System.out.println(maxSubArrSum(arr, k));

    }
}
