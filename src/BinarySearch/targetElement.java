package BinarySearch;

public class targetElement {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.print(findElement(arr, target));
    }

    static int findElement(int[] arr, int element) {
        int s = 0;
        int e = arr.length - 1;
        // find the middle element
        // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (element > arr[mid]) {
                s = mid + 1;
            } else if (element < arr[mid]) {
                e = mid - 1;
            } else {
                if (arr[mid] == element) {
                    return mid ;
                }
            }
        }
        return -1;

    }
}
