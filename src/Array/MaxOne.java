package Array;

//Max Consecutive Ones
//
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2

public class MaxOne {
    static void main(String[] args) {
        int[]arr={1,1,0,1,1,1};
        System.out.println(maxOne(arr));

    }
    static int maxOne(int[] nums){
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int num : nums) {

            if (num > 0) {
                count++;
            }
            else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(max,count);
    }

}
