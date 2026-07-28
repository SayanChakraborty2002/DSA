package hashing_basics;

import java.util.Scanner;

public class characterhashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the type of string MIX(lower +uppercase) OR only LOWERCASE");
        System.out.println("For Mix , type 'mix' and for lower , type 'lower");
        String stringType = sc.next();
        System.out.println("Enter the string");
        String s = sc.next();

        if (stringType.equals("mix")) {
            /*
             * HASH FOR MIX ALPHABETS : A-Z, a-z
             * ->Size of the hash array will be 256 as total characters 256
             * so, if i want to store the freqncy of 'a' or anr capital letter "A"
             * we will the it exactly at its ascii index:
             * ->hash[(int)character]++
             * 
             */

            int[] hashMix = new int[256];
            for (int i = 0; i < s.length(); i++) {
                hashMix[s.charAt(i)]++;
            }

            // Getting the query inputs
            System.out.print("Enter number of queries : ");
            int q = sc.nextInt();
            System.out.println("Enter the queries: ");
            while (q != 0) {
                char ch = sc.next().charAt(0);
                System.out.println(ch + "-> " + hashMix[ch]);
                q--;
            }

        } else if(stringType.equals("lower")) {
            // Hasing :- Pre Calculating the character frequency
            // for LOWERCASE letter
            int[] hash = new int[26]; // as the number of alphabets are 26 and only for lowercase

            /*
             * the ascii value of lowercase a-z : 97-122
             * so, if i want to store the freqncy of 'a'
             * method ->
             * 1. We will store the frequency of 'a' in the 0th index in the hash array for
             * 'b , index : 1 and so on ...'
             * 2. i have to find the index for that alohabet in the hash array
             * 3. formula : 'that alphabet' = 'a' ; It will calculate the index by
             * substracting
             * the ascci value of 'a' from that alphabet.
             * 4. Ex: for 'b' the index must be 2 ;
             * -> by formula : 'b' - 'a' ; i.e, index : 98 - 97 = 1 and so on...
             */

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int idx = ch - 'a';
                hash[idx]++;
            }

            // Getting the query inputs
            System.out.print("Enter number of queries : ");
            int q = sc.nextInt();
            System.out.println("Enter the queries: ");
            while (q != 0) {
                char ch = sc.next().charAt(0);
                System.out.println(ch + "-> " + hash[ch - 'a']);
                q--;
            }
        }

    }

}
