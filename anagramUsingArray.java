import java.util.Scanner;
import java.util.Arrays;

//using arrays package in java

public class Solution {

    static boolean isAnagram(String a, String b) {
       if(
       }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
