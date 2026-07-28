package hashing_basics;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter max no of elements in the array: ");
        int maxEle=sc.nextInt(); // to get the actual size we have to add one as array is '0' based index

        System.out.print("Enter the actual size of array:  ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size ;i++){
            arr[i]=sc.nextInt();
        }

        //Initialize hash array 
        int[] hash=new int[maxEle+1];


        //Calculate frequency 
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        System.out.println("Enter the number of queries:");
        int q= sc.nextInt();

        System.out.println("Enter your queries: ");
        while(q!=0){
            int x= sc.nextInt();
            System.out.println(x + "-> " + hash[x]);
            q--;
        }
        sc.close();
    }
}
