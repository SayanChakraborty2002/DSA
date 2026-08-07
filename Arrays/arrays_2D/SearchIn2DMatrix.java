package Arrays.arrays_2D;

public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] arr, int x) {
        int i=0 , j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(x==arr[i][j]) return true;
            else if(x>arr[i][j]) i++;
            else j--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr, 3));
    }
}
