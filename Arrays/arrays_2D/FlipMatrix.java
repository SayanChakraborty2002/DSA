package Arrays.arrays_2D;

public class FlipMatrix {
    public static void flip(int[][] arr, int i, int j) {
        if (arr[i][j] == 0)
            arr[i][j] = 1;
        else
            arr[i][j] = 0;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int matrixScore(int[][] arr) {
        print(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0){
                for(int j=0;j<arr[0].length ;j++){
                    flip(arr, i, j);
                }
            }
        }
        print(arr);
        System.out.println();
        for (int j = 1; j < arr[0].length; j++) {
            int zeros = 0, ones = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 0)
                    zeros++;
                else
                    ones++;
            }
            if (zeros > ones) {
                for (int i = 0; i < arr.length; i++) {
                    flip(arr, i, j);
                }
            }
        }
        print(arr);
        System.out.println();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = 1;
            for (int j = arr[0].length - 1; j >= 0; j--) {
                ans += x * arr[i][j];
                x *= 2;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
        System.out.print(matrixScore(arr));
    }
}
