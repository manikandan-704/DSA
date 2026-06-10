package TwoPointer;

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
        int[] arr = { 4,5,0,1,9,0,5,0 };
        moveZero(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
