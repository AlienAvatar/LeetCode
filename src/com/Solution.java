package com;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Set<String> set = new HashSet<>();
        set.add("leet");
        set.add("code");
        boolean result = solution.wordDict("leetcode",set);
        System.out.println(result);
    }

    public boolean wordDict(String s,Set<String> dict){
        boolean[] f = new boolean[s.length()+1];
        f[0] = true;

        for(int i = 1; i <= s.length();i++){
            for(int j = 0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j,i))){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
}
