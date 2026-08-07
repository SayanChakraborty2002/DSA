package Arrays.arrays_2D;

public class webForm {

    public static void  printWebForm(int[][] nums){
        int m = nums.length ,n=nums[0].length;
        for(int i=0;i<m ;i++){
            if(i%2!=0){
                for(int j=n-1;j>=0 ;j--){
                    System.out.print(nums[i][j] + " ");
                }
            }else{
                for(int j=0;j<n ;j++){
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3},
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        printWebForm(nums);
     }
}
