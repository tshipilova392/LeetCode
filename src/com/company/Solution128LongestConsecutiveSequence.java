package com.company;

import java.util.HashSet;
import java.util.TreeSet;

public class Solution128LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i]-1)){
                int count=1;
                while (hashSet.contains(nums[i]+1)){
                    count++;
                    nums[i]++;
                }
                result = Math.max(count, result);
            }
        }
        return result;
    }


}
