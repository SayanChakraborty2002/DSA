package recursion_baics;

import java.util.Scanner;

public class printName {
    static void printNameNTimes(int n) {
        //base case
        if (n < 1)
            return;

        // work
        System.out.println("Sayan");
        printNameNTimes(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        printNameNTimes(n);
    }

}
