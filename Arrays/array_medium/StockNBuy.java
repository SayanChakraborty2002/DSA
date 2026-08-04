package Arrays.array_medium;

public class StockNBuy {
    public static int maxProfitBrute(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1 ;j<nums.length ;j++){
                if(nums[j]>nums[i]){
                    ans=Math.max(ans , nums[j]-nums[i]);
                }
            }
        }
        return ans;
    }

     public static int maxProfitOptimal(int[] nums){
        int maxProfit=0 , minCost=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<minCost) minCost= nums[i];
            else maxProfit = Math.max(maxProfit, nums[i]-minCost);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] nums ={7,1,5,3,6,4};
        System.out.print(maxProfitOptimal(nums));
    }
}
