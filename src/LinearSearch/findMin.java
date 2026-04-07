package LinearSearch;

public class findMin {
    public static void main(String[] args) {
        int[] array={54,76,2,44,11,44};
        System.out.println(findMinimum(array));
        System.out.println(findMax(array));
    }
    static int findMinimum(int []a){
        int min=a[0];
        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    static int findMax(int []b){
        int max=0;
        for(int m=0;m<b.length;m++){
            if(max<b[m]){
                max=b[m];
            }
        }
        return max;
    }
}
