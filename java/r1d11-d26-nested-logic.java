import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();
        
        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();
        sc.close();
        
        int yearsLate = returnYear - dueYear;
        int monthsLate = returnMonth - dueMonth;
        int daysLate = returnDay - dueDay;
        
        //System.out.println("daysLate: " + daysLate + " monthsLate: " + monthsLate + " yearsLate: " + yearsLate);
        System.out.println (
            (yearsLate > 0 ) ? 10000 
            : (monthsLate > 0 && yearsLate == 0) ? monthsLate * 500
            : (daysLate > 0 && yearsLate == 0) ? daysLate * 15
            : 0
        );
    }
}