static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count=0;
        while(p<=s){
            count++;
            s=s-p;
            p=p-d;
            if(p<=m)
                p=m;
        }
        return count++;
    }
