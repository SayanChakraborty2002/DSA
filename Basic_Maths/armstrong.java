package Basic_Maths;

import java.util.Scanner;

public class armstrong {
    static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static boolean armstrongNo(int n) {
        int len=countDigit(n);
        int real = n;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += Math.pow(rem, len);
            n /=10;
        }
        return real == ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNo(n));
    }
}
