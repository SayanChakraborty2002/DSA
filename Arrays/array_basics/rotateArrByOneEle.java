package Arrays.array_basics;

public class rotateArrByOneEle {
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
    public static void rotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotateByOne(arr);
        print(arr);
    }
}
