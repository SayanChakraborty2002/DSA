package Arrays.array_haard;

import java.util.HashMap;

public class LogenstSubArrLengthWithSumZero {

    // T.C = O(N*N)
    public static int longestSubArr(int[] arr) {
        int len = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0)
                len = Math.max(len, 1);
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    // T.C = O(N)
    public static int longestSubArrUsingPrefix(int[] arr) {
        int maxLen = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if(prefixSum == 0) maxLen=Math.max(maxLen, i+1);
            else{
                if(map.containsKey(prefixSum)) maxLen=Math.max(maxLen, i-map.get(prefixSum));
                else map.put(prefixSum , i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 9, -3, 3, -1, 6, -5 };
        System.out.println("length: " + longestSubArrUsingPrefix(arr));
    }
}
