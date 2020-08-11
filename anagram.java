import java.util.Scanner;
//without the use of array package in java.

public class Solution {

    static boolean isAnagram(String a, String b) {
         int[] frequency = new int[26]; //initialize the frequency by 26 as 26 letters in the alphabet
      
      //convert the entire string to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
      //iterate the charcter 'c' till the end of the character array of both the string
        for (char c : a.toCharArray()) {
            frequency[(int) c - 97]++;
        }
      // 97 is the Ascii value of 'a'
        for (char c : b.toCharArray()) {
            frequency[(int) c - 97]--;
        }
        
        boolean anagrams = true;
        for (int i : frequency) {
            if (i != 0) {
                anagrams = false;
                break;
            }
        }
        return anagrams;
    }
  
  //main function
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

