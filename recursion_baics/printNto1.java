package recursion_baics;

public class printNto1 {
    static void oneToN(int n){
        if(n<1) return;

        oneToN(n-1);
        System.out.print(n+" ");
    }
    static void nto1(int n ){
        if(n<1) return;
        System.out.print(n+ " ");
        nto1(n-1);
    }
    public static void main(String[] args) {
        oneToN(5);
    }
}
