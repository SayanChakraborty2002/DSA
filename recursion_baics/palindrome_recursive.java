package recursion_baics;

public class palindrome_recursive {

    static boolean palindrome(String s ,int i , int j){
        //base case
        if(i>=j) return true;
        s=s.toLowerCase();
        char start=s.charAt(i);
        char end= s.charAt(j);
        if(!Character.isLetterOrDigit(start)) return  palindrome(s, i+1, j);
        else if(!Character.isLetterOrDigit(end)) return palindrome(s, i, j-1);
        else{
            if(start == end) return palindrome(s, i+1, j-1);
            else return false;
        }
        
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(palindrome(s ,0,s.length()-1));
    }
    
}
