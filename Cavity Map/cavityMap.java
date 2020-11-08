import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        int[][] arr=new int[grid.length][grid.length];
        String[] result= new String[grid.length];
        String s="";
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length();j++){
                arr[i][j]=Integer.parseInt(Character.toString(grid[i].charAt(j)));
            }
        }
        int n=grid.length;
        int m=grid[0].length();
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(i==0 || i==n || j==0 || j==m)
                    continue;
                else{
                    if(arr[i-1][j]<arr[i][j] && arr[i][j-1]<arr[i][j] && arr[i+1][j]<arr[i][j] && arr[i][j+1]<arr[i][j]){
                        arr[i][j]=-1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1)
                    s=s+"X";
                else
                s=s+Integer.toString(arr[i][j]);
            }
            result[i]=s;
            s="";
        }
        return result;
    }


    public static void main(String[] args)  {

        int n = 4;

        String[] grid ={"1112", "1912", "1892", "1234"};


        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print("\n");
            }
        }
    }
}

    //https://www.hackerrank.com/challenges/cavity-map/problem
