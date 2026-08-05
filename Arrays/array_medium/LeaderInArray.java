package Arrays.array_medium;

import java.util.ArrayList;
import java.util.Collections;

/*
Leaders are the elements which have no greater elements than them in the right side
Ex : [1,2,12,6,10,2,9] :-> leaders are 12,10,9
*/

public class LeaderInArray {
    public static ArrayList<Integer> findLeaders(int[] nums){
        ArrayList<Integer> ans =new ArrayList<>();
        int max=nums[nums.length-1];
        ans.add(max);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=max){
                ans.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,12,6,10,2,9};
        ArrayList<Integer> leaders=findLeaders(nums);
        for(int i=0;i<leaders.size();i++){
            System.out.print(leaders.get(i)+" ");
        }
    }
}
