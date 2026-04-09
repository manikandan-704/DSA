package Sorting.selectionSort;

 import java.util.Arrays;

public class sortArray {
    static void main(String[] a) {
        int[] arr={48,21,45,23,22};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int s=0;s<arr.length;s++){
            int last=arr.length-1-s;
            int maxNum=max(arr,last);
            swap(arr,last,maxNum);
        }
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
        static int max(int[] arr, int last){
            int maxIndex = 0;
            for(int i = 1; i <= last; i++){
                if(arr[i] > arr[maxIndex]){
                    maxIndex = i;
                }
            }
            return maxIndex;
    }
}

