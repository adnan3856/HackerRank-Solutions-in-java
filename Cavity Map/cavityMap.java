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
    
    //https://www.hackerrank.com/challenges/cavity-map/problem
