import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        List <String> users = new ArrayList <String> ();
        
        for(int i = 0; i <= inputs; i++){
            String entry = sc.nextLine();
            if(entry.matches(".*@gmail.com$")){
                users.add(entry.split("\\s+")[0]);
            }
        }
        
        Collections.sort(users);
        for(String name : users){
            System.out.println(name);
        }
    }
}