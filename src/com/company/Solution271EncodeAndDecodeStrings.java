package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution271EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qer");
        list.add("rfvbgt");
        list.add("1234");
        list.add("1234#5");
        String encode = encode(list);
        System.out.println(encode);
        List<String> result = decode(encode);
    }

    public static String encode(List<String> strs) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            int len = s.length();
            sb.append(len);
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        List<String> list = new ArrayList<>();
        int pos=0;
        while (pos<str.length()){
            int nextHashPosition = str.indexOf('#',pos);
            String numberBeforeHash = str.substring(pos, nextHashPosition);
            int number = Integer.parseInt(numberBeforeHash);
            String tmpString = str.substring(nextHashPosition+1,nextHashPosition+1+number);
            list.add(tmpString);
            pos=nextHashPosition+1+number;
        }
        return list;
    }
}
