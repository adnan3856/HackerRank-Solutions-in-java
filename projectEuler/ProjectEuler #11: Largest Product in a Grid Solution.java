import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int maxproduct(int [][] g){
            int max = 1;
            for (int i = 0; i < 20; i++){
                for (int j = 0; j < 20; j++){
                    if (j +3< 20){
                        if (g[i][j] * g[i][j + 1] * g[i][j + 2] * g[i][j + 3] > max){
                            max = g[i][j] * g[i][j + 1] * g[i][j + 2] * g[i][j + 3];
                        }
                        if (g[j][i] * g[j + 1][i] * g[j + 2][i] * g[j + 3][i] > max){
                            max = g[j][i] * g[j + 1][i] * g[j + 2][i] * g[j + 3][i];
                        }
                    }
                    if (j+3 < 20 && i+3<20){
                        if (g[j][i]*g[j+1][i+1] * g[j+2][i+2] * g[j+3][i+3] > max)
                            max = g[j][i]*g[j+1][i+1] * g[j+2][i+2] * g[j+3][i+3];
                        if (g[j+3][i] * g[j+2][i+1] * g[j+1][i+2] * g[j][i+3] > max)
                            max =g[j+3][i] * g[j+2][i+1] * g[j+1][i+2] * g[j][i+3];
                    }                       
                }
            }
            return max;
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(maxproduct(grid));
    }
}


//Largest product in a grid
https://www.hackerrank.com/contests/projecteuler/challenges/euler011/problem
