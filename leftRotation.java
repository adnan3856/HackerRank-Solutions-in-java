import java.util.*;
import java.util.Arrays;
public class Solution{
    public static int[] rotateArray(int a[],int d){
        int n = a.length;
        int[] tempArray= Arrays.copyOfRange(a,0,d); //this method copyOfRange is used to it copies the array within the parametes given, here 0 to d
        for (int i=d;i<n;i++)
            a[i-d]= a[i];
        for(int i=n-d;i<n;i++)
            a[i]=tempArray[i-n+d];
    return a;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); //number of elements in the array
        int d=sc.nextInt(); // number of rotations expected
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt(); // input elements of array
        }
        arr = rotateArray(arr,d);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
