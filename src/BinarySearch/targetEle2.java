package BinarySearch;

public class targetEle2 {
    public static void main(String[] args) {
        int[] arr={-1,2,3,5,-6,8,9,11,24};
        int target=-6;
        System.out.println(findIndex(arr,target));
    }
    static int findIndex(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            }
            else if(nums[middle]<target){
                start=middle+1;
            }
            else if(nums[middle]>target){
                end=middle-1;
            }
        }
        return -1;
    }
}
