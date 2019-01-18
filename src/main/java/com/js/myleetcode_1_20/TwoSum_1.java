package com.js.myleetcode_1_20;

import java.util.Arrays;

/**
 * @author jiangsai
 * @create 2019-01-18 10:30
 */
public class TwoSum_1 {

    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 5, 11};
        System.out.println(Arrays.toString(twoSum(a,10)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        a:
        for(;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    break a;
                }
            }
        }
        return new int[]{i,j};
    }

}
