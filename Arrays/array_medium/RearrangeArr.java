package Arrays.array_medium;

/*/
2149. Rearrange Array Elements by Sign
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 
Example 1:
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]

*/

public class RearrangeArr {

    // T.C=O(n) with two Iterations , Auxillary Space = O(n)
    public static int[] rearrangeBrute(int[] nums) {
        int[] ans = new int[nums.length];
        int idx1 = 0, idx2 = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[idx1] = nums[i];
                idx1 += 2;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[idx2] = nums[i];
                idx2 += 2;
            }
        }
        return ans;
    }


    // T.C=O(n) In one pass , Auxillary Space = O(n)
    public static int[] rearrangeOptimal(int[] nums) {
        int[] ans = new int[nums.length];
        int positive = 0, negative = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[positive] = nums[i];
                positive += 2;
            } else {
                ans[negative] = nums[i];
                negative += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] ans = rearrangeOptimal(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.print(ans[i] + " ");
    }
}
