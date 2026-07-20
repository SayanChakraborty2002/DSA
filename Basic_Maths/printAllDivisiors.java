package Basic_Maths;

import java.util.Scanner;

public class printAllDivisiors {
    public static void divisors(int n) {
        System.out.println("Divisores : ");
        // for(int i =1;i<=n;i++){
        // if(n%i==0){
        // System.out.print(i+ " ");
        // }
        // }

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n)
                    System.out.print(n / i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisors(n);
    }

}
