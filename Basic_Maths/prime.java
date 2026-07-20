//Prime number : the number which has only 2 factors i.e, 1 and the number itself

package Basic_Maths;

public class prime {
    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i*i<=n ; i++){
            if(n%i==0){
                c++;
                if(n/i != i) c++;
            }
        }
        return c==2;
    }
    public static void main(String[] args){
        System.out.println(isPrime(13));
    }
}
