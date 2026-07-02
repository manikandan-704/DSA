package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> result=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(result.containsKey(com)){
                return new int[]{result.get(com),i};
            }
            else{
                result.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
