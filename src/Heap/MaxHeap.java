package Heap;

import java.util.Arrays;

public class MaxHeap {
    static void main(String[] args) {
    int[] arr={70,45,50,30,35};
    int val=20;
    int[] result=insertHeap(arr,val);
        System.out.println(Arrays.toString(result));
    }
    public static int[] insertHeap(int[] arr, int val){
        // Increase array size by 1
        arr = Arrays.copyOf(arr, arr.length + 1);
        int i = arr.length-1;
        arr[i] = val;

        while (i > 0) {
            int parent = i / 2;
            if (arr[parent] < arr[i]) {
                swap(arr, parent, i);
                i = parent;
            } else {
                break;
            }
        }
        return arr;
    }
        static void swap(int[] arr, int first, int sec) {
            int temp = arr[first];
            arr[first] = arr[sec];
            arr[sec] = temp;
        }
}


