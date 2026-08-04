package Arrays.array_medium;

import java.util.Arrays;

public class NexPermutation {
    public static int  breakPoint(int[] nums){
        for(int i=nums.length-2 ;i>=0 ;i--){
            if(nums[i]<nums[i+1]) return i;
        }
        return -1;
    }

    public static int prevGreater(int[] nums , int idx){
        for(int i=nums.length-1;i>idx;i--){
            if(nums[i] > nums[idx]) return i;
        }
        return -1;
    }
    public static void rev(int[] nums ,int i , int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }

    public static void nextPermutationSol(int[] nums) {
        int idx=breakPoint(nums);
        if(idx==-1){
            Arrays.sort(nums);
            return;
        }else{
            int ele=prevGreater(nums , idx);
            int temp=nums[idx];
            nums[idx]=nums[ele];
            nums[ele]=temp;

            rev(nums, idx+1, nums.length-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        nextPermutationSol(nums);
        for(int i=0;i<nums.length;i++) System.out.print(nums[i] + " ");
    }

}
