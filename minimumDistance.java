// Complete the minimumDistances function below.
    static int minimumDistances(int[] arr) {
        int res=0;
        int max=Integer.MAX_VALUE,min=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    res=Math.abs(i-j);
                    if(res<max){
                        max=res;
                        min=res;
                }
                }
            }
        }
            if(res==0)
                min=-1;
    return min;
    }
    
    
    
    //Minimum Distance Hackerrank Solution
    //https://www.hackerrank.com/challenges/minimum-distances/problem
