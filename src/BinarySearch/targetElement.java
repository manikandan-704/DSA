package BinarySearch;

public class targetElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 25, 33, 45};
        int target = 44;
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
