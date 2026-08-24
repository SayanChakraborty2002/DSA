package Binary_search.BS_1D;

public class Bounds {


    //Upper bound:-  x < arr[i]
    public static int upperBound(int[] arr ,int x){
        int n=arr.length;
        int ub=n;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>x){
                hi=mid-1;
                ub=mid;
            }else lo=mid+1;
        }

        return ub;
    }

    //Lower bound:- x <= arr[i]
    public static int lowerBound(int[] arr , int x){
        int n=arr.length;
        int lb=n;
        int lo=0 , hi =n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>=x) {
                hi=mid-1;
                lb=mid;
            }else lo=mid+1;
        }

        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println("Lower bound: " + upperBound(arr , 2));
    }
}
