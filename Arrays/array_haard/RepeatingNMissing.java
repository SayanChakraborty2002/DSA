package Arrays.array_haard;

public class RepeatingNMissing {


    //T.C = O(n*n)
    public static int[] findTheNumbersBrute(int[] arr){
        int[] ans= {-1,-1};

        int n= arr.length;
        for(int i=1 ;i<=n ;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[j] == i) c++;
            }
            if(c == 2) ans[0] =i;
            else if( c==0 ) ans[1] =i;
            if( ans[0]!=-1 && ans[1] !=-1) break;
        }

        return ans;
    }
    

    //t.c=O(n) , auxillary space = O(n)
    public static int[] findTheNumbersHashing(int[] arr){
        int[] ans= {-1,-1};

        int n= arr.length;
        int[] hash = new int[n+1];
        for(int i=0 ;i<n ;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<n+1;i++){
            if(hash[i]==2) ans[0] = i;
            else if(hash[i]==0) ans[1] = i;
        }

        return ans;
    }
   
    public static int[] findTheNumbersOptimal(int[] arr){
        int n= arr.length;
        int Sn= (n*(n+1)) /2 , S2n = (n*(n+1) *(2*n+1))/6;
        int S = 0 , S2=0;
        for(int i =0;i<n;i++){
            S+= arr[i];
            S2 += (int)Math.pow(arr[i], 2);
        }

        int val1= S-Sn; //x - y = val1
        int val2 = S2 -S2n; // x2 - y2 = val2

        /*  
            -> x2 - y2 = val2
            -> (x+y)(x-y) = val2 ; but (x-y) =val1
            -> (x+y)val1 = val2
            -> x+y = val2/val1
             but x+y = val2

            now , 
            -> x+y = val2
            -> x-y = val1
            -----------------
            -> x = (val2 + val1 ) / 2

            Now, 
            -> x+y = val2 ;
            -> y=val2-x
        */

        val2 = val2/val1 ; // x+y
        int x= (val2 + val1) / 2;
        int y= val2 -x ;
        return new int[]{x,y};

    }
    public static void main(String[] args) {
        int[] arr ={3, 5, 4, 1, 1};
        int[] ans = findTheNumbersOptimal(arr);
        for(int i =0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
