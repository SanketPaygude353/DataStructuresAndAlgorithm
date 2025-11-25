package ArraysQuestions.Easy;
//66. Plus one
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].

import java.util.Arrays;

public class LeetCode066 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, just return
            }
            digits[i] = 0; // set to 0 and carry 1 to next digit
        }

        // If all digits were 9 (like 999 + 1 = 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
