package Arrays.arrays_2D;

public class spiralMatrix {

    public static void spiral(int[][] nums) {
        int minRow = 0, minCol = 0;
        int maxRow = nums.length-1, maxCol = nums[0].length-1;
        while (minRow <= maxRow && minCol <= maxCol) {
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(nums[minRow][j] + " ");
            }
            minRow++;

            if (minRow > maxRow || minCol > maxCol)
                break;
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(nums[i][maxCol] + " ");
            }
            maxCol--;

            if (minRow > maxRow || minCol > maxCol)
                break;

            for (int j = maxCol ; j >= minCol; j--) {
                System.out.print(nums[maxRow][j] + " ");
            }
            maxRow--;

            if (minRow > maxRow || minCol > maxCol)
                break;

            for (int i = maxRow; i >= minRow; i--) {
                System.out.print(nums[i][minCol] + " ");
            }
            minCol++;
        }

    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        spiral(nums);
    }

}
