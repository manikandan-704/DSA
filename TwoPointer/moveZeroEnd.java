
class moveZeroEnd {
    static void moveZero(int[] arr) {
        int left = 0; // pointer for non-zero position
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                // swap nums[i] and nums[j]
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 5 };
        moveZero(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
