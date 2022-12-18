package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution238ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] mas = productExceptSelf(new int[]{-1,1,0,-3,3});
    }

    public static int[] productExceptSelf(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int zeroPosition = -1;
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if (nums[i]==0){
                zeroPosition=i;
            }
        }
        int[] result = new int[nums.length];
        if (map.containsKey(0)&&map.get(0)==2){
            return result;
        }

        if (map.containsKey(0)&&map.get(0)==1){
            int product = 1;
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (entry.getKey()!=0)
                product*=Math.pow(entry.getKey(),entry.getValue());
            }
            result[zeroPosition]=product;
            return result;
        }

        for (int i=0;i<nums.length;i++){
            int product = 1;
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (entry.getKey()==nums[i]){
                    product*=Math.pow(entry.getKey(),entry.getValue()-1);
                }
                else{
                    product*=Math.pow(entry.getKey(),entry.getValue());
                }
            }
            result[i]=product;
        }
        return result;
    }
}
