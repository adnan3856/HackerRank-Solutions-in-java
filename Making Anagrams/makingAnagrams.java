 static int makingAnagrams(String s1, String s2) {
        int[] a1=new int[26];
        int[] a2=new int[26];
        int result=0;
        for(int i=0;i<s1.length();i++){
            a1[(int)s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            a2[(int)s2.charAt(i)-97]++;
        }
        for(int j=0;j<26;j++){
            result+=Math.abs(a1[j]-a2[j]);
        }
        return result;
    }
    
    //hackerrank question
    //https://www.hackerrank.com/challenges/making-anagrams/problem
