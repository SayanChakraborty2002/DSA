package Arrays.arrays_2D;

public class basics {
    public static int largest(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                max = Math.max(max, nums[i][j]);
            }
        }
        return max;
    }

    public static void traverse2DArr(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }System.out.println();
        }
    }

    public static void addTwoMatrics(int[][] nums1, int[][] nums2){
        int[][] ans =new int[nums1.length][nums1[0].length];
        for(int i=0;i<nums1.length ;i++){
            for(int j=0;j<nums1[0].length ;j++){
                ans[i][j]=nums1[i][j] + nums2[i][j];
            }
        }
        traverse2DArr(ans);
    }

    public static void transpose(int[][] nums){
        int m=nums.length ,n =nums[0].length;
        int[][] ans =new int[n][m];
        for(int j=0;j<n ;j++){
            for(int i=0;i<m ;i++){
                ans[j][i]=nums[i][j];
            }
        }
        traverse2DArr(ans);
    }


    //matrix must be square 
    public static void makeSameMatrixTranspose(int[][] nums){
        for(int i=0;i<nums.length ;i++){
            for(int j=0;j<=i ;j++){
                int temp = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i] =temp;
            }
        }
        traverse2DArr(nums);
    }
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3 ,1 },
                { 4, 5, 6 ,2},
                { 7, 8, 9 ,3}
        };

        int[][] nums2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        makeSameMatrixTranspose(nums2);

    }
}
