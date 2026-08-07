package Arrays.arrays_2D;

public class MatrixMultiply {
    public static int[][] multiply(int[][] a, int[][] b) {
        int m = a.length;
        int n = b[0].length;
        int[][] ans = new int[m][n];

        for(int i=0;i<m ;i++){
            for(int j=0; j<n;j++){
                for(int k=0;k<n;k++){
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2 }, { 3, 4 } };
        int[][] b = { { 5, 6 }, { 7, 8 } };
        int m = a[0].length;
        int n = b.length;
        if (m != n) {
            System.out.println("Matrix Multiplicaition is not Possible ");
            return;
        }
        int[][] ans = multiply(a, b);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}