package hashing_basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyUsingHashMap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];

        Map<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else map.put(arr[i], map.get(arr[i])+1);
        }

        int q= sc.nextInt();
        while (q!=0) {
            int x=sc.nextInt();
            System.out.println(x + "-> " +map.get(x));
            q--;
        }


    }
    
}
