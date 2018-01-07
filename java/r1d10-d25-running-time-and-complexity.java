import java.io.*;
import java.util.*;

public class Solution {
    public static boolean[] sieve(int n) {
        boolean[] s = new boolean[n];
        for(int i = 2; i < n; i++){
            if(s[i]){
                continue;
            } else {
                for(int j = 2; i * j < n; j++){
                    s[i*j] = true;
                }    
            }
        }
        //for(int i = 0; i < s.length; i++){
        //    System.out.println("i: " + i + " s[i]: " + s[i]);
        //}
        return s;
    }
    
    public static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        // boolean[] s = sieve(n);
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0){
                //System.out.println("Not prime");
                return false;
            }
        }
        /*for(int i = 2; i * i < n; i++){
            if(s[i]){
                continue;
            } else {
                if(n % i == 0){
                    return false;
                }
            }
        }*/
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        for(int o : arr){
            if(isPrime(o)){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}