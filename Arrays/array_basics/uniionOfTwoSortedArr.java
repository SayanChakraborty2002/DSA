package Arrays.array_basics;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class uniionOfTwoSortedArr {

    public static int[] unionUsingMap(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else
                map.put(arr1[i], 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i]) + 1);
            } else
                map.put(arr2[i], 1);
        }
        int[] ans = new int[map.size()];
        int i = 0;
        for (Integer key : map.keySet()) {
            ans[i] = key;
            i++;
        }
        return ans;
    }

    public static int[] unionUsingSet(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr1.length ; i++)
            set.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            set.add(arr2[i]);
        int[] ans= new int[set.size()];
        int i=0;
        for(int item : set) ans[i++]=item;
        return ans;
    }

    public static int[] unionTwoPoiner(int[] arr1 ,int[] arr2){
        int n=arr1.length, m=arr2.length;
        int[] ans=new int[n+m];
        int i=0,j=0 ,k=0;
        while(i<n && j<m){
            if(arr1[i] == arr2[j] ){
                if(k==0 || ans[k-1]!=arr1[i]) {
                    ans[k]=arr1[i];
                    k++;
                }
                i++;j++;
            }
            else if(arr1[i]<arr2[j]){
                if(k==0 || ans[k-1]!=arr1[i]) ans[k++] =arr1[i];
                i++;
            }
            else {
                if(k==0 || ans[k-1]!=arr2[j]) ans[k++] =arr2[j];
                j++;
            }
        }
        while(i<n) {
            if(k==0 || ans[k-1]!=arr1[i]) ans[k++] =arr1[i];
            i++;
        }
        while(j<m)  {
            if(k==0 || ans[k-1]!=arr2[j]) ans[k++] =arr2[j];
            j++;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 9 }, arr2[] = { 2, 3, 4, 4, 5, 45, 80 };
        int[] ans = unionTwoPoiner(arr1, arr2);
        rotateArrByOneEle.print(ans);
    }
}
