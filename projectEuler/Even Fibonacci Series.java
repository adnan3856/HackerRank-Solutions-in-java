import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long fib(long n){
      long i=1;
    long sum=0;
    long f0 = 2;
     long f1 = 8;
     long f2=0;
     while(f1<=n){
         sum+=f1;
      f2 = 4*f1 + f0;
      f0=f1;
      f1=f2;
  }
  return sum+2;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        while(t>0){
        long n=in.nextLong();
          System.out.println(fib(n));
          t--;
        }
    }
}
