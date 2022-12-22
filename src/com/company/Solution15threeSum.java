package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length==0) return result;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int firstElement = nums[i];
            int startPosition = i+1;
            int endPosition = nums.length-1;

            while (startPosition<endPosition){
                int sum = firstElement+nums[startPosition]+nums[endPosition];
                if (sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(firstElement);
                    list.add(nums[startPosition]);
                    list.add(nums[endPosition]);
                    result.add(list);
                    while (startPosition < endPosition && nums[startPosition] == nums[startPosition + 1]) {
                        startPosition++;
                    }
                    while (startPosition < endPosition && nums[endPosition] == nums[endPosition - 1]) {
                        endPosition--;
                    }
                    startPosition++;
                    endPosition--;
                }
                if (sum>0){
                    endPosition--;
                }
                if (sum<0){
                    startPosition++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = threeSum(new int[]{-1,0,1,2,-1,-4});
        int x=0;
    }
}
