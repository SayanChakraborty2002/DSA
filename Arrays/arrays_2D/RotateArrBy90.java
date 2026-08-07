package Arrays.arrays_2D;

public class RotateArrBy90 {
    public static void rev(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void traverse2DArr(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] nums) {
        int m=nums.length ,n=nums[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i] =temp;
            }
        }

        for(int i=0;i<m;i++){
            rev(nums[i] , 0 ,n-1);
        }
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3},
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        traverse2DArr(nums);
        System.out.println();
        rotate(nums;
        traverse2DArr(nums);
    }
}
