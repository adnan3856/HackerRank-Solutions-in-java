import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
         int[] lb = new int['Z' - 'A' + 1];
    boolean esp = false;
    //The number of ladybirds for each color is saved in lb
    //and evaluated if there is at least one space
    for (char c : b.toCharArray()) {
        if(c!='_'){
            lb[c-'A']++;
        }else{
            esp = true;
        }
    }
    //If there are no spaces, all the ladybugs should have an equal partner
    if (!esp) {
        for (int i = 1; i < b.length()-1; i++) {
            if(b.charAt(i)!=b.charAt(i-1) && b.charAt(i)!=b.charAt(i+1)){
                return "NO";
            }
        }
    }
    //If there are spaces, there can not be a ladybug of a single color
    for (int i : lb) {
        if(i==1) return "NO";
    }
    //If there is no unhappy ladybug
    return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


//Happy LadyBugs

//https://www.hackerrank.com/challenges/happy-ladybugs/problem
