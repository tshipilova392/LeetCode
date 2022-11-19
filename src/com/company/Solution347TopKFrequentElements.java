package com.company;

import java.util.*;

public class Solution347TopKFrequentElements {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int number : nums){
            countMap.put(number, countMap.getOrDefault(number,0)+1);
        }

        List<List<Integer>> freq = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length+1; i++) {
            freq.add(new ArrayList<>());
        }
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            Integer val = entry.getValue();
            Integer key = entry.getKey();
            freq.get(val).add(key);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = freq.size()-1; i >=0 ; i--) {
            for (Integer x : freq.get(i)){
                list.add(x);
                if (list.size()==k){
                    return list.stream().mapToInt(d->d).toArray();
                }
            }
        }
        return list.stream().mapToInt(d->d).toArray();
    }

    public static void main(String[] args) {
        int[] mas = topKFrequent(new int[]{1},1);
        int j=0;
    }
}
