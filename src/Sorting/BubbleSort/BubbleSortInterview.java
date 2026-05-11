package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortInterview {
    static void main(String[] args) {
        int[] elements={3,6,4,2,91,1};
        System.out.println(Arrays.toString(bubble(elements)));
    }
    public static int[] bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

}
