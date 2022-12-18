package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution238ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] mas = productExceptSelf(new int[]{1,2,3,4});
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length-1; i >=0; i--) {
            result[i]*=product;
            product*=nums[i];
        }
        return result;
    }
}
