package Arrays.array_basics;

/*
    26. Remove Duplicates from Sorted Array
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

    Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

    The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

    Custom Judge:

    The judge will test your solution with the following code:

    int[] nums = [...]; // Input array
    int[] expectedNums = [...]; // The expected answer with correct length

    int k = removeDuplicates(nums); // Calls your implementation

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
        assert nums[i] == expectedNums[i];
    }
    If all assertions pass, then your solution will be accepted.

 
    Example 1:

    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    Example 2:

    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
*/

/*
    Appraoch : using 2 pointer : i,j
    we will keep i and j starting from 0th index ;
    -start a while loop until j<arr.length
    1.check if arr[i] == arr[j] , means duplicate elements we dont need that so do-> j++;
    2.if(arr[i] != arr[j] ) , means new element , do-> i++ ; then ; arr[i]=arr[j]

    qs : why first i++ then arr[i]=arr[j]??
    ans: 
        for ex: arr[] = [0,0,1,1,1,2,2,3,3,4]
                i=0 ,j=0; arr[i]=0 , arr[j]=0;
                so, j++; until j reaches arr[2] ,i.e. 1;
                now j=1 a new element so we need it .
                if we dont do i++ and just do arr[i]=arr[j] then we will not have the unique element i.e. '0'
                for example cuurent arr[]=[0,0,1];
                i=0 , j=2, arr[i]=0 , arr[j] = 1;
                if we just do arr[i]=arr[j] , then the arr becomes : arr=[1,1,1] and we have lost the element '0';
                so we have todo i++ to prevent loosing the ith element and the arra becomes :
                    ->i++;
                    ->arr=[0,1,1]; where i=1, j=2;
                
*/

public class removeDuplicates {
    public static void removeDuplicateEle(int[] nums){
        int i=0 ,j=0;
        while(j<nums.length){
            if(nums[i] == nums[j]) j++;
            else{
                i++;
                nums[i]=nums[j];
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicateEle(nums);
        for(int i=0;i<nums.length;i++) System.out.print(nums[i] + " ");
    }
}
