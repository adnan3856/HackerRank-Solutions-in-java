public String[] cavityMap1(String[] grid){
char arr[][]= new char[grid.length][];

    for (int i = 0; i < grid.length; i++) 
    {
        arr[i]=grid[i].toCharArray();
    }

    for (int i = 0; i < arr.length; i++) 
    {
        for (int j = 0; j < arr.length; j++) 
        {
            if(!(i==0 || j==0 || i== arr.length-1 || j== arr.length-1))
            {
                int ele=arr[i][j];
                if(ele>arr[i][j-1]&&ele>arr[i][j+1]&&ele>arr[i-1][j]&&ele>arr[i+1][j])
                {
                    arr[i][j]='X';
                }
            }
        }
    }
    int k=0;String s;

    for (char[] cs : arr) 
    {
        s="";
        for (char cs2 : cs) 
        {
            s=s +cs2+"";
        }
        grid[k++]=s;
    }
    return grid;
    }
    
    
