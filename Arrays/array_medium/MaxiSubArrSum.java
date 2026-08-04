package Arrays.array_medium;

public class MaxiSubArrSum {

    // T.C = O(n)
    public static int kadaneAlgo(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0)
                sum = 0;

        }
        return maxSum;
    }

    public static void printSubArrWithMaxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1, last = -1;
        int l=0 ;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) l = i;
            sum += nums[i];
            if (sum >= max) {
                max=sum;
                start=l; last=i;
            }
            if(sum<0) sum=0;
        }
        for(int i =start ; i<=last ;i++) System.out.print(nums[i]+" ");
    }

    public static int sumBrute(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3,8, -7,2, -2,3,4, -10, -4};
        printSubArrWithMaxSum(nums);
    }
}
