package TwoPointer;

import java.util.Arrays;

import java.util.*;

//class Solution {
//    public static int[] rearrange(int[] arr) {
//        int n = arr.length;
//        int[] res = new int[n];
//
//        res[0] = arr[0]; // first stays same
//
//        int left = 1;
//        int right = n - 1;
//        int index = 1;
//
//        while (left <= right) {
//            if (index < n) res[index++] = arr[right--];
//            if (index < n) res[index++] = arr[left++];
//        }
//
//        return res;
//    }
class Array{
static int[] rearrange(int[] arr) {
    int n=arr.length;
    int[] result=new int[n];

    result[0]=arr[0];

    int i=1;
    int j=n-1;
    int ind=1;

    while(i<=j) {
        if(ind<n) {
            result[ind++]=arr[j--];
        }
        if(ind<n) {
            result[ind++]=arr[i++];
        }
    }
    return result;
}

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 9, 4};
        int[] result = rearrange(arr);
        System.out.println(Arrays.toString(result));
    }
}