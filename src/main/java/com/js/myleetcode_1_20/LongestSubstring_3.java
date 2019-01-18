package com.js.myleetcode_1_20;

/**
 * @author jiangsai
 * @create 2019-01-18 10:40
 */
public class LongestSubstring_3 {

    public static void main(String[] args) {
        String s = "pwwkew";
        int r = lengthOfLongestSubstring(s);
        System.out.println(r);
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 1;
        int max = 0;
        while(i <= s.length() - 1){
            while(j <= s.length()){
               boolean r = hasDuplicate(s.substring(i, j));
               if(r == true){
                   i++;
               }else{
                   int temp = j - i;
                   if(temp > max){
                       max = temp;
                   }
               }
               j++;
            }
            if(j == s.length()+1){
                i++;
            }
        }
        return max;
    }

    public static boolean hasDuplicate(String s){
        boolean r = false;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    r = true;
                }
            }
        }
        return r;
    }
}
