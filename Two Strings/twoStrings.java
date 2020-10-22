 static String twoStrings(String s1, String s2) {
        Set set1 = new HashSet(Arrays.asList(s1.split("")));
    Set set2 = new HashSet(Arrays.asList(s2.split("")));

    Set set3 = new HashSet(set1);
    set3.retainAll(set2);
    return set3.isEmpty() ? "NO" : "YES";
    }
    
    
    //hackerrank two Strings problem
    //https://www.hackerrank.com/challenges/two-strings/problem
