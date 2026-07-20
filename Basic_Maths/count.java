package Basic_Maths;

import java.util.Scanner;

// Time Complexity : O(log10)num

public class count {
    static void countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }

    static void reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = 10*rev + (num%10);
            num /= 10;
        }
        System.out.println(rev);
    }
    public int rev(int num){
        int rev=0;
        while(num!=0){
            rev = rev*10 + (num%10);
            num /=10 ;
        }
        return rev;
    }
    //checking palindrome
    public boolean isPalindrome(int x) {
        if(x<0) return false ;
        int r=rev(x);
        return x==r;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        System.out.println();
        // while (num != 0) {
        //     int remainder = num % 10;
        //     System.out.print(remainder + " ");
        //     num = num / 10;
        // }

        // countDigit(num);
        reverse(num);
    }
}