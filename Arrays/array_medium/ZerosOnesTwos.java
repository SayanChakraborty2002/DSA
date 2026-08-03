package Arrays.array_medium;

/*
    LeetCode - 75
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.

    Example 1:
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

    Example 2:
    Input: nums = [2,0,1]
    Output: [0,1,2]
*/

public class ZerosOnesTwos {
    public static void sort(int[] nums){
        int zeros = 0,ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) zeros++;
            else if(nums[i] ==1) ones++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<zeros) nums[i]=0;
            else if(i<ones+zeros) nums[i]=1;
            else nums[i]=2;
        }
    }
   
    public static void swap(int[] nums ,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void dutchFlagAlgo(int[] nums){
        int lo=0,mid=0,hi=nums.length-1;
        while(mid<=hi){
            if(nums[mid] == 0 ) {
                swap(nums, mid, lo);
                lo++;mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, hi);
                hi--;
            }
            else mid++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        dutchFlagAlgo(nums);
        for(int i=0 ;i<nums.length;i++) System.out.print(nums[i] + " ");
    }
}
