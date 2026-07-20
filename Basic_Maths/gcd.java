package Basic_Maths;

public class gcd {
    static int linearGCD(int n ,int m){
        for(int i=Math.min(n, m) ; i>=1; i--){
            if(n%i==0 && m%i==0) {
                return i ;
            }
        }
        return 1;
    }

    static int euclidianGCD(int a,int b){
        while(a>0 && b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        if(a==0) return b;
        return a;
    }
    public static void main(String[] args) {
        System.out.println(euclidianGCD(12, 2));
    }
}
