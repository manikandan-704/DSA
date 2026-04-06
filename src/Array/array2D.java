package Array;
import java.util.Arrays;

//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.

import java.lang.reflect.Array;

public class array2D {
    public static void main(String[] args) {
        int[][] accounts={{1,7,3},
                          {3,2,10}};
        int r=accSum(accounts);
        System.out.print(r);
    }
    static int accSum(int[][] accs){
        int max=0;
        int[] sum=new int[accs.length];
        for(int cus=0;cus<accs.length;cus++){
            int add=0;
            for(int acc=0;acc<accs[cus].length;acc++){
                add=add+accs[cus][acc];
            }
            max= Math.max(max,add);
        }
        return max;
    }
}
