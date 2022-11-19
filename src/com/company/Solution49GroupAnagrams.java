package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution49GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length==0) return res;
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] alf = new char[26];
            for (char c : s.toCharArray()){
                alf[c-'a']++;
            }
            String key  = new String(alf);
            map.computeIfAbsent(key,k->new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> str = groupAnagrams(strs);
        int i=0;
    }
}
