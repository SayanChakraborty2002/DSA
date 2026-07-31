package Arrays.array_basics;

public class LinearSearch {
    public static boolean find(int[] arr ,int x){
        for(int i=0;i<arr.length ;i++){
            if(arr[i] == x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        System.out.println(find(arr,9));
    }
}
