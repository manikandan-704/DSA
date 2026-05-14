package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortRecursion {

    static void main(String[] args) {
        int[] arr={4,8,9,5,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }
    // MergeSort using Recursion
    public static int [] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid)); //[4,8,9,5] => returns [4,5,8,9]
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));   // [3,2,1] => returns[1,2,3]

        return merge(left,right);
    }

    // Merging the left and right array
    public static int[] merge(int[] firstHalf, int[] secondHalf){

        int[] mix=new int[firstHalf.length+secondHalf.length];

        int i=0;
        int j=0;
        int k=0;

        //check which is less and add to a mix array
        while(i<firstHalf.length && j<secondHalf.length){
            if(firstHalf[i]<secondHalf[j]){
                mix[k]=firstHalf[i];
                i++;
            }
            else{
                mix[k]=secondHalf[j];
                j++;
            }
            k++;
        }

        //while either the left and right greater than each other returns the remining value on the end of mix
        while(i<firstHalf.length){
            mix[k]=firstHalf[i];
            i++;
            k++;
        }
        while(j<secondHalf.length){
            mix[k]=secondHalf[j];
            j++;
            k++;
        }
        return mix;
    }
}
