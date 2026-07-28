package recursion_baics;

public class revserArray {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] revBasic(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }

    public static void revTwoPointers(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        printArr(arr);
    }

    public static void swap(int[] arr ,int i,int j) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void revRecursiveTwoPointer(int[] arr ,int i , int j){
        if(i>=j) return;
        swap(arr, i, j);
        revRecursiveTwoPointer(arr, i+1, j-1);
    }
    public static void revRecursiveOnePointer(int[] arr ,int i ){
        if(i>=arr.length/2) return;
        swap(arr, i, arr.length-1-i);
        revRecursiveOnePointer(arr, i+1);
    }
    static void isPalindromeRecursive(String s,int i ,int n){
        if(i>=n) {
            System.out.println("Palindrome String"); return;
        }
        if(s.charAt(i)!=s.charAt(n-1-i)) {
            System.out.println("Not plaindorme "); return;
        }

        isPalindromeRecursive(s, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        String s="madam";
        isPalindromeRecursive(s, 0, s.length());
    }
}
