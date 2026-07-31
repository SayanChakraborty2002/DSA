package Arrays.array_basics;

public class largetsEle {
    public static int[] largest$smallest(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length ; i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int[] arr={12,32,100,24,-12,-1,1202};
        int[] ans =largest$smallest(arr);
        System.out.print("max : " +ans[0] + " min: "+ans[1]);
    }
}
