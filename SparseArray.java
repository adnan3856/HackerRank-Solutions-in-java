import java.util.*;
public class solutions{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i]=sc.next();
        }
        int q=sc.nextInt();
        
        for(int i=0; i<q;i++){
            String queries=sc.next();
            int num=0;
            for(int j=0;j<n;j++){
                if(queries.equals(strings[j]))
                    num++; 
            }
            System.out.println(num);
        }  
    }
}
