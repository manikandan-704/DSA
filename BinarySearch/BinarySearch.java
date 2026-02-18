package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

         int target = 10000;
        int[] array = new int[100000];

        // Fill array FIRST
        
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        // Then search

        int index = Arrays.binarySearch(array, target);

        if(index >= 0){
            System.out.println("Element found at position: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
