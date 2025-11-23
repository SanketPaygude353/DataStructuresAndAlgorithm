package ArraysQuestions.Easy;
//66 . Plus One
//Input: digits = [1,2,3]
//Output: [1,2,4]
public class LeetCode66 {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry
            }
            digits[i] = 0; // set to 0 and carry
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        int[] digits = {9, 9, 8};

        int[] ans = plusOne(digits);

        // Print the result
        System.out.print("[ ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
