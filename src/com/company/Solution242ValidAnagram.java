package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution242ValidAnagram {
    public static boolean isAnagram(String s, String t) {
//        char[] charArrayS = s.toCharArray();
//        char[] charArrayT = t.toCharArray();
//        Arrays.sort(charArrayS);
//        Arrays.sort(charArrayT);
//        return Arrays.compare(charArrayS,charArrayT)==0;

        if (s.length()!=t.length()) return false;

        int[] characters = new int[26];
        for (int i = 0; i <s.length(); i++) {
            characters[s.charAt(i)-'a']++;
            characters[t.charAt(i)-'a']--;
        }
        for (int x : characters){
            if (x!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("tash","qwer"));
    }
}
