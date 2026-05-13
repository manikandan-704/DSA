package Sorting.cyclicSort;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {1, 3, 0, 4};

        System.out.println(findMissing(nums));
    }

    public static int findMissing(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correctIndex = nums[i];

            if (nums[i] < nums.length &&
                    nums[i] != nums[correctIndex]) {

                swap(nums, i, correctIndex);

            } else {
                i++;
            }
        }

        // check missing number
        for (int ind = 0; ind < nums.length; ind++) {

            if (nums[ind] != ind) {
                return ind;
            }
        }

        return nums.length;
    }

    public static void swap(int[] nums, int f, int s) {

        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}