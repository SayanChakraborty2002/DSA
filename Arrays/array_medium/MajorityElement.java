package Arrays.array_medium;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityI(int[] nums){
        int mid=nums.length/2;
        Arrays.sort(nums);
        return nums[mid];
    }

    public static int majorityOptimal(int[] nums){
        int ele=-1;
        int count=0;
        for(int i=0;i<nums.length ;i++) {
            if(count == 0) {
                count=1;
                ele=nums[i];
            }
            else if(ele==nums[i]) count++;
            else if(ele!=nums[i]) count--;
        }
        int majority=0;
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==ele) majority++;
        }
        if(majority>nums.length/2) return ele;
        else return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityI(nums));
    }
}
