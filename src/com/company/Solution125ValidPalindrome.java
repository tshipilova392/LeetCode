package com.company;

import java.util.Locale;

public class Solution125ValidPalindrome {
    public static boolean isPalindrome(String s) {
        //O(n) time
        //O(n) memory
        s = s.replaceAll("[^a-zA-Z\\d]","").toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String t=sb.toString();
        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
