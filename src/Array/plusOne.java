package Array;

import java.util.Arrays;

public class plusOne {
    public static void main() {
        int[] digits={9,9,9};
        int[] r=  plusone(digits);
        System.out.print(Arrays.toString(r));
    }


        static int[] plusone(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
            }

            // If all digits were 9 → [9,9] → [1,0,0]
            int[] result = new int[digits.length + 1];
            result[0] = 1;

            return result;
        }
    }


