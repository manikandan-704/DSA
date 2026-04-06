public class occurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4 };
        int k = 3;
        int l = 0;
        int count = 0;
        // for(int right=0;right<arr.length;right++){
        // if(arr[right]!=k){
        // l++;
        // }
        // count++;{
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] != k) {
                int temp = arr[l];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
            }
            count++;
        }
        System.out.println(l);
        System.out.println(count);
    }

}
