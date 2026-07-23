package Recursion;

import java.util.Arrays;

public class SumTriangle {
    static void main(String[] args){
        int[] nums={1,2,3,4,5};
        System.out.println(TriSum(nums));
    }
    static int TriSum(int[] nums){
        if (nums.length == 1) {
            return nums[0];
        }
        int[] temp = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            temp[i] =(nums[i] + nums[i+1])%10;
        }
        System.out.println(Arrays.toString(temp));
        return TriSum(temp);
    }
}
