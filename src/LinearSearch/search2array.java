package LinearSearch;

import java.util.Arrays;

public class search2array {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,56,34},
                {22,99,78,44},
                {22,111,79,42}
        };
        int tar=41;
        System.out.println(Arrays.toString(ele(mat, tar)));
        System.out.println(max(mat));
    }
    static int[] ele(int [][] arr,int tar){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==tar){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int [][]arr1) {
        int max = 0;
        for (int[] rows : arr1) {
            for (int cols : rows) {
                if (max < cols) {
                    max = cols;
                }
            }
        }
        return max;
    }
}
