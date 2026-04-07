package Sorting.BubbleSort;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        int[] arr={3,7,9,2,6};
        System.out.println(Arrays.toString(bubble(arr)));
    }
     public static int[] bubble(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
