package Arrays.array_basics;

/*
    283. Move Zeroes

    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.

    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]
*/

public class moveZeros {
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
    /*
        Aproach:1 -> traverse the array using 2 pointer if(arr[j] == 0) j++ 
                  ->if(arr[j]!=0) then swap arr[i] and arr[j] ; then increment i and j;
    */
    public static void moveZerostoEnd(int[] arr){
        int i=0 , j=0;
        while(j<arr.length){
            if(arr[j]==0) j++;
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
    }

    /*
        Appraoch-2 :Using 2 pointer starts from 0 ,i,j
        ->first take all the non zero element in the first positoin
        ->print the last elements 0;
        ->if(arr[j]!=0) then arr[i]=arr[j] ; i++; it make all the 0 elements nonzero 
        ->then i is at the position from wheer all the elements must be zero 
        ->make the elements 0 from i->n
    */
    public static void moveZerostoEnd2(int[] arr){
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                arr[i]=arr[j]; i++;
            }
            j++;
        }
        while(i<arr.length) {
            arr[i]=0; i++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZerostoEnd2(arr);
        print(arr);
    }
}
