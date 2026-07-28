package recursion_baics;

public class sumOfN {
    public static int sumOfFirstN(int n) {
        if (n <= 1)
            return n;
        // work
        int ans = n + sumOfFirstN(n - 1);
        return ans;
    }

    public static void sum(int n) {
        int ans = (n * (n + 1)) / 2;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        sum(6);
    }
}
