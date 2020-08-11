import java.util.Scanner;
import java.util.Arrays;

//using arrays package in java

public class Solution {

    static boolean isAnagram(String a, String b) {
       if(a.length()!=b.length()){
           ret = false;
       }
        else{
         char[] arrA= a.toLowerCase().toCharArray();//convert to lowercase or uppercase for sorting of the characters
         char[] arrB=b.toLowerCase().toCharArray();
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            ret = Arrays.equals(arrA,arrB);
            
            //if you want to ignore the toLowerCase() in the above character array formation then in the above line use:->
            //ret = Arrays.equalsIgnoreCase(arrA,arrB);
        }
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
