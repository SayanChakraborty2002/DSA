package Arrays.array_basics;

public class findMissing {
    static int missingNo(int[] arr){
        int n=arr.length+1;
        int actualSum=0;
        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++) actualSum+=arr[i];
        return sum-actualSum;
    }

    public static void main(String[] args) {
        int[] arr ={8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNo(arr));
    }
    
}
