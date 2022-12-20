package com.company;

import java.util.HashSet;
import java.util.TreeSet;

public class Solution128LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        TreeSet<Integer> treeSet = new TreeSet<>();
        int min = Integer.MAX_VALUE;
        for (int x: nums){
            treeSet.add(x);
            min = Math.min(min,x);
        }
        int sequenceLength=1;
        int maxSequenceLength=1;
        int previousElement = min;
        for (int x: treeSet){
            if (x-previousElement==1){
                sequenceLength++;
            }
            else{
                maxSequenceLength = Math.max(maxSequenceLength,sequenceLength);
                sequenceLength=1;
            }
            previousElement=x;
        }
        maxSequenceLength = Math.max(maxSequenceLength,sequenceLength);
        return maxSequenceLength;
    }


}
