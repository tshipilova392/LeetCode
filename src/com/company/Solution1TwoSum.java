package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> positions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (positions.containsKey(diff)) return new int[]{i,positions.get(diff)};
            positions.put(nums[i],i);
        }
        return new int[]{};
    }
}
