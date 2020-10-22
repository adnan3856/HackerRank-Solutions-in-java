//hackerrank problem 
//Game of thrones I
//https://www.hackerrank.com/challenges/game-of-thrones/problem

    static String gameOfThrones(String s) {
        int[] arr=new int[26];
        String result="";
        int oddCount=0;
        for(int i=0;i<s.length();i++)
            arr[(int)s.charAt(i)-97]++;
            if(s.length()%2==0){
                for(int i=0;i<26;i++){
                    if(arr[i]%2==0)
                        result="YES";
                    else{
                        result="NO";
                        break;
                    }
                }
            }
            else{
                for(int i=0;i<26;i++){
                    if(arr[i]%2!=0){
                        oddCount++;
                    }
                }
                if(oddCount>1)
                    result="NO";
                else
                    result="YES";
            }

    return result;
    }
