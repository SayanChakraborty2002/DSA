package recursion_baics;

import java.util.Scanner;

public class factorial {

    static int fact(int n){
        //base case
        if(n==1) return 1;

        //actual work
        int ans=n*fact(n-1);
        
        //returning statement
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
