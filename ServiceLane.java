import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) throws IOException {
   Scanner sc=new Scanner(System.in);       
     int n=sc.nextInt();
     int t=sc.nextInt();
     int width[]=new int[n];
     for(int i=0;i<n;i++){
         width[i]=sc.nextInt();
     }        
     for(int i=0;i<t;i++){
         int min=Integer.MAX_VALUE;
    int startindex=sc.nextInt();
    int endindex=sc.nextInt();
       for(int j=startindex;j<=endindex;j++){
           if(min>=width[j]){
               min=width[j];
           }
       }
    System.out.println(min);
     }
} 
}


// hackerRank solution
//https://www.hackerrank.com/challenges/service-lane/problem
