package Arrays.array_medium;

import java.util.Arrays;
import java.util.HashMap;

/*
    1. Two Sum - 
    You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
   
    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
*/

public class TwoSumArr {

    // Best Approach on every cases , T.C =O(n)
    public static int[] twoSumOptimal(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k)
                return new int[] { nums[i], nums[j] };
            else if (sum < k)
                i++;
            else
                j--;
        }
        return new int[] { -1, -1 };
    }

    // Avg T.C=O(n)
    public static int[] twoSumUsingHashMap(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = k - nums[i];
            if (map.containsKey(remaining))
                return new int[] { map.get(remaining), i };
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    // T.C=O(n*n) ; n=size of array;
    public static int[] twoSum(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int k = 6;
        int[] ans = twoSumOptimal(nums, k);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
