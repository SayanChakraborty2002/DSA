package Arrays.array_basics;

/*
    189. Rotate Array

    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation: 
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
*/

public class rotateArrByk {

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
    

    public static void rev(int[] arr , int i ,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    
    //Approach-1 : Take a new array place the k->n th element first then 0->k th element in a new array 
    //T.C = O(n) , auxillary space=O(n)
    public static int[] rotateBykUsingNewArr(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<k ;i++){
            ans[i] = nums[n-k + i];
        }
        for(int i=0 ;i<n-k ; i++){
            ans[i+k] = nums[i]; 
        }
        return ans;
    }

    //Apprach-2 : Using O(1) auxillary space we will reverse the first half , then second half then the whole array 
    public static void revByK(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        rev(arr, 0,n-k-1 );
        rev(arr, n-k, n-1);
        rev(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int[] ans = rotateBykUsingNewArr(arr, k);
        // revByK(ans, k);
        int n=arr.length;
        k=k%n;
        rev(arr, 0,n-k-1 );
        rev(arr, n-k, n-1);
        rev(arr, 0, n-1);
        print(arr);

    }

}
