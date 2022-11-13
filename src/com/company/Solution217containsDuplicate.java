package com.company;

import java.util.Arrays;

public class Solution217containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int equalAmount=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                equalAmount++;
            }
        }
        return !(equalAmount == 0);
    }
}
