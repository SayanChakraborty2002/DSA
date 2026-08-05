package Arrays.array_medium;
/*
leetcode-128 : Longest Consecutive Sequence
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LogestConsecutive {
    public static boolean search(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x)
                return true;
        }
        return false;
    }

    public static int brute(int[] nums) {
        int length = 1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int count = 1;
            while (search(nums, x + 1) == true) {
                count++;
                x++;
            }
            length = Math.max(length, count);
        }
        return length;
    }

    public static int better(int[] nums) {
        int len = 1;
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                continue;
            else {
                if (nums[i + 1] - nums[i] == 1) {
                    count++;
                } else {
                    len = Math.max(count, len);
                    count = 1;
                }
            }
        }
        len = Math.max(count, len);
        return len;
    }

    public static int optimal(int[] nums) {
        if (nums.length == 0)
            return 0;
        int len = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int ele : set) {
            if (!set.contains(ele - 1)) {
                int start = ele;
                int count = 1;
                while (set.contains(start + 1)) {
                    start++;
                    count++;
                }
                len = Math.max(count, len);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println("length: " + optimal(nums));
    }
}
