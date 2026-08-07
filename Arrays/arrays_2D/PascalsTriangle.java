package Arrays.arrays_2D;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void printArrayList(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> printPascalsTriangle(int n) {
        List<List<Integer>> ans =new ArrayList<>(n);
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) list.add(1);
                else{
                    list.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = printPascalsTriangle(n);
        printArrayList(list);
    }
}
