import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
         String[] tokens = s.split("[^\\p{Alpha}]+");
        
        int size = (s.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);
        
        for(String s1 : tokens) {
            System.out.println(s1);
        }
        scan.close();
    }
}

