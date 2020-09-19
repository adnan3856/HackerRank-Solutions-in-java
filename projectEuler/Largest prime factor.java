import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long max=0;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long div = 2;

  while (div <= Math.floor(Math.sqrt(n))) {
    if (n % div== 0) {
      n /= div;
    } else {
      div++;
    }
  }
 System.out.println(n);
    }
}
}
